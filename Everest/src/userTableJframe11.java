
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class userTableJframe11 extends javax.swing.JFrame {

    User user = new User();
    Hashing hashing = new Hashing();

    public userTableJframe11() {
        initComponents();
        show_user();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public ArrayList<User> teacherList() {
        ArrayList<User> arrayList = new ArrayList<User>();

        Connection conn = DBConnection.getConnection();
        String query = "select * from user ";
        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                user = new User(rs.getInt("userid"), rs.getString("Username"), rs.getString("Password"));
                arrayList.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(teacherTableJframe1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }

    public void show_user() {
        ArrayList<User> arrayList = teacherList();
        DefaultTableModel model = (DefaultTableModel) jTable_Display_Teachers.getModel();
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
                DefaultTableModel model = (DefaultTableModel) jTable_Display_Teachers.getModel();
                model.setRowCount(0);
                show_user();
                JOptionPane.showMessageDialog(null, "Data " + message + " Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Do not " + message);
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Teachers = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        user_idTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
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

        jTable_Display_Teachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "user id", "user  name"
            }
        ));
        jTable_Display_Teachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_TeachersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Teachers);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("user name : ");

        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        user_idTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                user_idTFKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("user id:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_idTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        updateButton.setText("update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteButton.setText("delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

    private void jTable_Display_TeachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_TeachersMouseClicked
        // TODO add your handling code here:
        int i = jTable_Display_Teachers.getSelectedRow();
        TableModel tableModel = jTable_Display_Teachers.getModel();
        user_idTF.setText(tableModel.getValueAt(i, 0).toString());
        usernameTF.setText(tableModel.getValueAt(i, 1).toString());

    }//GEN-LAST:event_jTable_Display_TeachersMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
//       try {
//           String pass=hashing.toHash(passwordTF.getText().toString());
//          user.setPassword(pass);
//           String query = "UPDATE user SET Username='" + usernameTF.getText() + "',Password=" + user.getPassword();
//        excuteSQLQuery(query, "update");
//       } catch (NoSuchAlgorithmException ex) {
//           Logger.getLogger(userTableJframe11.class.getName()).log(Level.SEVERE, null, ex);
//       }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:

        String query = "Delete from user where userid=" + user_idTF.getText();
        excuteSQLQuery(query, "Deleted");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void user_idTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_idTFKeyReleased
//        try {
//            String query = "select * from user where Username=?";
//            Connection connect = null;
//            Connection conn = login.doConnection(connect);
//            PreparedStatement preparedStmt = conn.prepareStatement(query);
//            preparedStmt.setString(1, searchTextF1.getText());
//            ResultSet rs;
//            rs = preparedStmt.executeQuery();
//          
//             if (rs.next()) {
//                String str1 = rs.getString("userid");
//                user_idTF.setText(str1);
//                String str2 = rs.getString("Username");
//                usernameTF.setText(str2);
//                String str3 = rs.getString("Password");
//                passwordTF.setText(str3);
//             }
//           
//
//        } catch (SQLException ex) {
//            Logger.getLogger(teacherTableJframe1.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_user_idTFKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Teachers;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField user_idTF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
