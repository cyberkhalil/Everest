package all;

import students.Student;
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class RegistraionTableJframe extends javax.swing.JFrame {

    Student student;
    String course_name = null;

    public RegistraionTableJframe() {
        initComponents();
        show_student();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    public ArrayList<Student> registratinList() {
        ArrayList<Student> arrayList = new ArrayList<>();
        ArrayList<String> courseList = new ArrayList<>();
        //Connection connect = null;
        Connection conn = DBConnection.getConnection();

        //String query1 = "select CourseName from course where CourseId = (select courseID from student_course,student where student_course.StdID = student.StdID)";
        try {
            String CourseName = "";
            String query = "select * from student_course,student where student_course.StdID = student.StdID ";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student(rs.getString("StdName"), rs.getInt("StdPhoneNum"));
                arrayList.add(student);
            }
            String query1 = "select CourseName from course where CourseId = (select courseID from student_course,student where student_course.StdID = student.StdID)";
            PreparedStatement ps1 = conn.prepareStatement(query1);
            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                CourseName = rs1.getString("CourseName");
                courseList.add(CourseName);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentTableJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }

    public void show_student() {
        ArrayList<Student> arrayList = registratinList();
        DefaultTableModel model = (DefaultTableModel) jTable_Display_Registration.getModel();
        Object[] rObjects = new Object[3];
        for (int i = 0; i < arrayList.size(); i++) {
            rObjects[0] = arrayList.get(i).getStdName();
            rObjects[1] = arrayList.get(i).getStdPhoneNum();
            rObjects[2] = course_name;
            model.addRow(rObjects);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Registration = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AddToCourse = new javax.swing.JButton();
        AddToExam = new javax.swing.JButton();

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

        jTable_Display_Registration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "student name", "phone number", "course name"
            }
        ));
        jTable_Display_Registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_RegistrationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Registration);

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

        AddToCourse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddToCourse.setForeground(new java.awt.Color(0, 51, 153));
        AddToCourse.setText("Enroll a student to a course");
        AddToCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCourseActionPerformed(evt);
            }
        });

        AddToExam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddToExam.setForeground(new java.awt.Color(0, 51, 153));
        AddToExam.setText("Enroll a student to an exam");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(AddToCourse)
                .addGap(130, 130, 130)
                .addComponent(AddToExam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddToCourse)
                    .addComponent(AddToExam)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_Display_RegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_RegistrationMouseClicked

    }//GEN-LAST:event_jTable_Display_RegistrationMouseClicked

    private void AddToCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCourseActionPerformed
    }//GEN-LAST:event_AddToCourseActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCourse;
    private javax.swing.JButton AddToExam;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Registration;
    // End of variables declaration//GEN-END:variables
}
