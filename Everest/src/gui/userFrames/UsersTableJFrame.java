package gui.userFrames;

import gui.loginFrames.Login;
import java.sql.SQLException;
import javax.naming.NoPermissionException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import users.User;
import users.UserUtil;
import utils.Model;

public final class UsersTableJFrame extends javax.swing.JFrame {

// TODO    User selectedUser;
    public UsersTableJFrame() {
        initComponents();
        update_users_table();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public void update_users_table() {

        try {
            this.jUsersTable.setModel(
                    Model.buildTableModel(UserUtil.getUsersResultSet(Login.user)));
        } catch (SQLException | NoPermissionException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jUsersTable = new javax.swing.JTable();
        data_Pnl = new javax.swing.JPanel();
        userName_Lbl = new javax.swing.JLabel();
        privilege_TF = new javax.swing.JTextField();
        userId_TF = new javax.swing.JTextField();
        userId_Lbl = new javax.swing.JLabel();
        privilege_Lbl = new javax.swing.JLabel();
        username_TF = new javax.swing.JTextField();
        Buttons_Pnl = new javax.swing.JPanel();
        jButtonSetPassword = new javax.swing.JButton();
        jButtonDeleteUser = new javax.swing.JButton();
        jButtonSetUsername = new javax.swing.JButton();
        jButtonSetPrivilege = new javax.swing.JButton();
        TitlejPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jUsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "username", "privilege"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jUsersTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jUsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUsersTableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jUsersTable);

        data_Pnl.setBackground(new java.awt.Color(255, 255, 255));
        data_Pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        userName_Lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userName_Lbl.setForeground(new java.awt.Color(0, 51, 153));
        userName_Lbl.setText("Username :");

        privilege_TF.setEditable(false);

        userId_TF.setEditable(false);
        userId_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userId_TFKeyReleased(evt);
            }
        });

        userId_Lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userId_Lbl.setForeground(new java.awt.Color(0, 51, 153));
        userId_Lbl.setText("User ID :");

        privilege_Lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        privilege_Lbl.setForeground(new java.awt.Color(0, 51, 153));
        privilege_Lbl.setText("privilege :");

        username_TF.setEditable(false);
        username_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_TFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout data_PnlLayout = new javax.swing.GroupLayout(data_Pnl);
        data_Pnl.setLayout(data_PnlLayout);
        data_PnlLayout.setHorizontalGroup(
            data_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_PnlLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(data_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(privilege_Lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userName_Lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userId_Lbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(data_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(privilege_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        data_PnlLayout.setVerticalGroup(
            data_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_PnlLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(data_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userId_Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(data_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userName_Lbl)
                    .addComponent(username_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(data_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privilege_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(privilege_Lbl))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        Buttons_Pnl.setBackground(new java.awt.Color(255, 255, 255));
        Buttons_Pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jButtonSetPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonSetPassword.setText("Set Password");
        jButtonSetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetPasswordActionPerformed(evt);
            }
        });

        jButtonDeleteUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonDeleteUser.setText("Delete User");
        jButtonDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteUserActionPerformed(evt);
            }
        });

        jButtonSetUsername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonSetUsername.setText("Set Username");
        jButtonSetUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetUsernameActionPerformed(evt);
            }
        });

        jButtonSetPrivilege.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonSetPrivilege.setText("Set Privilege");
        jButtonSetPrivilege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetPrivilegeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Buttons_PnlLayout = new javax.swing.GroupLayout(Buttons_Pnl);
        Buttons_Pnl.setLayout(Buttons_PnlLayout);
        Buttons_PnlLayout.setHorizontalGroup(
            Buttons_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buttons_PnlLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(Buttons_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSetUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(Buttons_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSetPrivilege, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        Buttons_PnlLayout.setVerticalGroup(
            Buttons_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Buttons_PnlLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(Buttons_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeleteUser)
                    .addComponent(jButtonSetPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(Buttons_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSetUsername)
                    .addComponent(jButtonSetPrivilege))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        TitlejPanel.setBackground(new java.awt.Color(255, 255, 255));
        TitlejPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Everest Training center");

        javax.swing.GroupLayout TitlejPanelLayout = new javax.swing.GroupLayout(TitlejPanel);
        TitlejPanel.setLayout(TitlejPanelLayout);
        TitlejPanelLayout.setHorizontalGroup(
            TitlejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlejPanelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TitlejPanelLayout.setVerticalGroup(
            TitlejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addGroup(TitlejPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Buttons_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(TitlejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TitlejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(data_Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Buttons_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsersTableMouseClicked
        int i = jUsersTable.getSelectedRow();
        TableModel tableModel = jUsersTable.getModel();
        userId_TF.setText(tableModel.getValueAt(i, 0).toString());
        username_TF.setText(tableModel.getValueAt(i, 1).toString());
        privilege_TF.setText(tableModel.getValueAt(i, 2).toString());

    }//GEN-LAST:event_jUsersTableMouseClicked

    private void jButtonSetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetPasswordActionPerformed
        String pass = JOptionPane.showInputDialog(
                rootPane, "New Password :", DISPOSE_ON_CLOSE);

        if (pass == null || pass.isEmpty()) {
            JOptionPane.showMessageDialog(
                    rootPane, "You didn't change password");
            return;
        }
        try {
            User selectedUser = UserUtil.getUser(Login.user, username_TF.getText());
            selectedUser.setPassword(pass);
        } catch (SQLException | NoPermissionException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
    }//GEN-LAST:event_jButtonSetPasswordActionPerformed

    private void jButtonDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteUserActionPerformed

        try {
            User selectedUser = UserUtil.getUser(Login.user, username_TF.getText());
            UserUtil.deleteUser(Login.user, selectedUser);
        } catch (SQLException | NoPermissionException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        update_users_table();
    }//GEN-LAST:event_jButtonDeleteUserActionPerformed

    private void userId_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userId_TFKeyReleased
        //TODO remove this !
    }//GEN-LAST:event_userId_TFKeyReleased

    private void username_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_TFActionPerformed
        // TODO remove this !
    }//GEN-LAST:event_username_TFActionPerformed

    private void jButtonSetUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetUsernameActionPerformed
        String username = JOptionPane.showInputDialog(
                rootPane, "New Username :", DISPOSE_ON_CLOSE);

        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(
                    rootPane, "You didn't change password");
            return;
        }
        try {
            User selectedUser = UserUtil.getUser(Login.user, username_TF.getText());
            selectedUser.setUsername(username);
        } catch (SQLException | NoPermissionException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        update_users_table();
    }//GEN-LAST:event_jButtonSetUsernameActionPerformed

    private void jButtonSetPrivilegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetPrivilegeActionPerformed

        int choice = JOptionPane.showOptionDialog(rootPane,
                "Select User new privilege ",
                "Set User Privilege",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new Object[]{"Admin", "Normal User"},
                "Admin");

        if (choice < 0) { // nothing selected
            return;
        }
        try {
            User selectedUser = UserUtil.getUser(Login.user, username_TF.getText());
            if (choice == 0) {
                UserUtil.setUserPrivilege(Login.user, selectedUser, "Admin");
            } else {
                UserUtil.setUserPrivilege(Login.user, selectedUser,
                        "Normal User");
            }

        } catch (SQLException | NoPermissionException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getClass().getSimpleName() + "\n" + ex.getMessage());

        }
        update_users_table();
    }//GEN-LAST:event_jButtonSetPrivilegeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttons_Pnl;
    private javax.swing.JPanel TitlejPanel;
    private javax.swing.JPanel data_Pnl;
    private javax.swing.JButton jButtonDeleteUser;
    private javax.swing.JButton jButtonSetPassword;
    private javax.swing.JButton jButtonSetPrivilege;
    private javax.swing.JButton jButtonSetUsername;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jUsersTable;
    private javax.swing.JLabel privilege_Lbl;
    private javax.swing.JTextField privilege_TF;
    private javax.swing.JLabel userId_Lbl;
    private javax.swing.JTextField userId_TF;
    private javax.swing.JLabel userName_Lbl;
    private javax.swing.JTextField username_TF;
    // End of variables declaration//GEN-END:variables
}
