package all;


import db.DBConnection;
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

public final class TeacherTableJframe extends javax.swing.JFrame {

    Teacher teacher;
    Course course;
    String course_name = null;

    public TeacherTableJframe() {
        initComponents();
        show_teacher();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public ArrayList<Teacher> teacherList() {
        ArrayList<Teacher> arrayList = new ArrayList<>();

        Connection connection = DBConnection.getConnection();
        String query = "select * from teacher ";
        String query1 = "select CourseName from teacher,course where TeacherId=Teacher_TeacherId";
        Statement st;
        ResultSet rs;
        Statement st1;
        ResultSet rs1;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                teacher = new Teacher(rs.getInt("TeacherId"), rs.getString("TeacherName"), rs.getInt("TeacherPhoneNumber"));
                arrayList.add(teacher);
            }
            st1 = connection.createStatement();
            rs1 = st1.executeQuery(query1);
            while (rs1.next()) {
                course_name = rs1.getString("CourseName");

            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }

    public void show_teacher() {
        ArrayList<Teacher> arrayList = teacherList();
        DefaultTableModel model = (DefaultTableModel) jTable_Display_Teachers.getModel();
        Object[] rObjects = new Object[4];
        for (int i = 0; i < arrayList.size(); i++) {
            rObjects[0] = arrayList.get(i).getTeacherID();
            rObjects[1] = arrayList.get(i).getTeacherName();
            rObjects[2] = arrayList.get(i).getTeacherPhoneNumber();
            rObjects[3] = course_name;
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
                show_teacher();
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
        jTable_Display_Teachers = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        teachernameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phone_numberTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        teacher_idTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        searchTextF1 = new javax.swing.JTextField();
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
                "teacher id", "teacher name", "phone number", "course name"
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
        jLabel1.setText("teacher name : ");

        teachernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachernameTFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("phone number : ");

        phone_numberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_numberTFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("search :");

        teacher_idTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teacher_idTFKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("teacher id:");

        searchTextF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextF1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phone_numberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchTextF1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacher_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teachernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextF1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(teacher_idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(teachernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phone_numberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
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
                .addGap(33, 33, 33)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap(43, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teachernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachernameTFActionPerformed
    }//GEN-LAST:event_teachernameTFActionPerformed

    private void phone_numberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_numberTFActionPerformed
    }//GEN-LAST:event_phone_numberTFActionPerformed

    private void jTable_Display_TeachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_TeachersMouseClicked
        int i = jTable_Display_Teachers.getSelectedRow();
        TableModel tableModel = jTable_Display_Teachers.getModel();
        teacher_idTF.setText(tableModel.getValueAt(i, 0).toString());
        teachernameTF.setText(tableModel.getValueAt(i, 1).toString());
        phone_numberTF.setText(tableModel.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jTable_Display_TeachersMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        try {
            String TeacherName = teachernameTF.getText();
            int PhoneNumber = Integer.parseInt(phone_numberTF.getText());
            int teacherID = Integer.parseInt(teacher_idTF.getText());
            String query = "UPDATE teacher SET TeacherName=?,TeacherPhoneNumber=? where TeacherId=?";
            PreparedStatement ps4 = DBConnection.getConnection().prepareStatement(query);
            ps4.setString(1, TeacherName);
            ps4.setDouble(2, PhoneNumber);
            ps4.setInt(3, teacherID);
            ps4.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable_Display_Teachers.getModel();
            model.setRowCount(0);
            show_teacher();
            JOptionPane.showMessageDialog(null, "Updated sucessfully");
        } catch (SQLException ex) {
            Logger.getLogger(BookTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            int teacherID = Integer.parseInt(teacher_idTF.getText());
            String query = "Delete from teacher where TeacherId=?";
            PreparedStatement ps4 = DBConnection.getConnection().prepareStatement(query);
            ps4.setInt(1, teacherID);
            ps4.execute();
            DefaultTableModel model = (DefaultTableModel) jTable_Display_Teachers.getModel();
            model.setRowCount(0);
            show_teacher();
            teacher_idTF.setText("");
            teachernameTF.setText("");
            phone_numberTF.setText("");
            JOptionPane.showMessageDialog(null, "deleted sucessfully");
        } catch (SQLException ex) {
            Logger.getLogger(BookTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void teacher_idTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teacher_idTFKeyReleased
        try {
            String query = "select * from teacher where TeacherName=?";
            //Connection connect = null;
            Connection conn = DBConnection.getConnection();
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, searchTextF1.getText());
            ResultSet rs;
            rs = preparedStmt.executeQuery();
            String query1 = "select CourseName from teacher,course where TeacherId=Teacher_TeacherId";
            PreparedStatement preparedStmt1 = conn.prepareStatement(query1);
            ResultSet rs1;
            rs1 = preparedStmt1.executeQuery();
            if (rs.next()) {
                String str1 = rs.getString("TeacherId");
                teacher_idTF.setText(str1);
                String str2 = rs.getString("TeacherName");
                teachernameTF.setText(str2);
                String str3 = rs.getString("TeacherPhoneNumber");
                phone_numberTF.setText(str3);
            } else if (rs1.next()) {
                String str4 = rs1.getString("CourseName");
                //course_nameTF.setText(str4);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_teacher_idTFKeyReleased

    private void searchTextF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextF1KeyReleased
    }//GEN-LAST:event_searchTextF1KeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Teachers;
    private javax.swing.JTextField phone_numberTF;
    private javax.swing.JTextField searchTextF1;
    private javax.swing.JTextField teacher_idTF;
    private javax.swing.JTextField teachernameTF;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
