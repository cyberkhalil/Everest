package all;


import login.Login;
import db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NoPermissionException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import users.UserUtil;

public final class UsersTableJFrame extends javax.swing.JFrame {

    users.User selectedUser;

    public UsersTableJFrame() {
        initComponents();
        update_users_table();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public ArrayList<User> getUsersArrayList() {
        ArrayList<User> arrayList = new ArrayList<>();

        Connection conn = DBConnection.getConnection();
        String query = "select * from user ";
        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                User u = new User(rs.getInt("userid"), rs.getString("Username"), rs.getString("Privilege"));
                arrayList.add(u);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        return arrayList;
    }

    public void update_users_table() {
        { // remove all rows
            DefaultTableModel dm = (DefaultTableModel) jUsersTable.getModel();
            int rowCount = dm.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }
        }
        ArrayList<User> arrayList = getUsersArrayList();
        DefaultTableModel model = (DefaultTableModel) jUsersTable.getModel();
        Object[] rObjects = new Object[3];
        for (int i = 0; i < arrayList.size(); i++) {
            rObjects[0] = arrayList.get(i).getUserId();
            rObjects[1] = arrayList.get(i).getUsername();
            rObjects[2] = arrayList.get(i).getPassword();

            model.addRow(rObjects);
        }
    }

    public void excuteSQLQuery(String Query, String message) {
        Connection conn = DBConnection.getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            if (st.executeUpdate(Query) == 1) {
                DefaultTableModel model = (DefaultTableModel) jUsersTable.getModel();
                model.setRowCount(0);
                update_users_table();
                JOptionPane.showMessageDialog(null, "Data " + message + " Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Do not " + message);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jUsersTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userprivilege = new javax.swing.JTextField();
        user_idTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonSetPassword = new javax.swing.JButton();
        jButtonDeleteUser = new javax.swing.JButton();
        jButtonSetUsername = new javax.swing.JButton();
        jButtonSetPrivilege = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
        jUsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jUsersTable);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Username :");

        userprivilege.setEditable(false);

        user_idTF.setEditable(false);
        user_idTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                user_idTFKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("User ID :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("privilege :");

        usernameTF.setEditable(false);
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userprivilege, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userprivilege, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSetUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSetPrivilege, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeleteUser)
                    .addComponent(jButtonSetPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSetUsername)
                    .addComponent(jButtonSetPrivilege))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Everest Training center");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsersTableMouseClicked
        int i = jUsersTable.getSelectedRow();
        TableModel tableModel = jUsersTable.getModel();
        user_idTF.setText(tableModel.getValueAt(i, 0).toString());
        usernameTF.setText(tableModel.getValueAt(i, 1).toString());
        userprivilege.setText(tableModel.getValueAt(i, 2).toString());

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
            users.User selectedUser = UserUtil.getUser(Login.user, usernameTF.getText());
            selectedUser.setPassword(pass);
        } catch (SQLException | NoPermissionException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
    }//GEN-LAST:event_jButtonSetPasswordActionPerformed

    private void jButtonDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteUserActionPerformed

        try {
            users.User selectedUser = UserUtil.getUser(Login.user, usernameTF.getText());
            UserUtil.deleteUser(Login.user, selectedUser);
        } catch (SQLException | NoPermissionException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        update_users_table();
    }//GEN-LAST:event_jButtonDeleteUserActionPerformed

    private void user_idTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_idTFKeyReleased
        //TODO remove this !
    }//GEN-LAST:event_user_idTFKeyReleased

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO remove this !
    }//GEN-LAST:event_usernameTFActionPerformed

    private void jButtonSetUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetUsernameActionPerformed
        String username = JOptionPane.showInputDialog(
                rootPane, "New Username :", DISPOSE_ON_CLOSE);

        if (username == null || username.isEmpty()) {
            JOptionPane.showMessageDialog(
                    rootPane, "You didn't change password");
            return;
        }
        try {
            users.User selectedUser = UserUtil.getUser(Login.user, usernameTF.getText());
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

        if (choice < 0) {
            // nothing selected
            return;
        }
        try {
            users.User selectedUser = UserUtil.getUser(Login.user, usernameTF.getText());
            if (choice == 0) {
                selectedUser.setPrivilege("Admin");
            } else {
                selectedUser.setPrivilege("Normal User");
            }

        } catch (SQLException | NoPermissionException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        update_users_table();
    }//GEN-LAST:event_jButtonSetPrivilegeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteUser;
    private javax.swing.JButton jButtonSetPassword;
    private javax.swing.JButton jButtonSetPrivilege;
    private javax.swing.JButton jButtonSetUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jUsersTable;
    private javax.swing.JTextField user_idTF;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JTextField userprivilege;
    // End of variables declaration//GEN-END:variables
}
