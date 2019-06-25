package gui.studentFrames;

import students.StudentUtil;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import students.Student;
import utils.PublicStaticFinals;
import utils.gui.GUI_Util;

public class StudentsEditFrame extends javax.swing.JFrame {

    private Student selectedStudent;

    public StudentsEditFrame() {
        initComponents();
        try {
            this.studentsTbl.setModel(
                    GUI_Util.buildTableModel(StudentUtil.getStudents()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentsSPnl = new javax.swing.JScrollPane();
        studentsTbl = new javax.swing.JTable();
        studentDataPnl = new javax.swing.JPanel();
        studentNameLbl = new javax.swing.JLabel();
        studentPhoneTf = new javax.swing.JTextField();
        studentIdTf = new javax.swing.JTextField();
        studentIdLbl = new javax.swing.JLabel();
        studentPhoneLbl = new javax.swing.JLabel();
        studentNameTf = new javax.swing.JTextField();
        studentAddedByLbl = new javax.swing.JLabel();
        studentAddedByTf = new javax.swing.JTextField();
        ButtonsPnl = new javax.swing.JPanel();
        setNameBtn = new javax.swing.JButton();
        setPhoneBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        setAddedByBtn = new javax.swing.JButton();
        setAddedByBtn1 = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        studentsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        studentsTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsTblMouseClicked(evt);
            }
        });
        studentsSPnl.setViewportView(studentsTbl);

        studentDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        studentDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        studentNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentNameLbl.setText("Student name :");

        studentPhoneTf.setEditable(false);

        studentIdTf.setEditable(false);

        studentIdLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentIdLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentIdLbl.setText("Student ID   :");

        studentPhoneLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentPhoneLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentPhoneLbl.setText("Student phone :");

        studentNameTf.setEditable(false);

        studentAddedByLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentAddedByLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentAddedByLbl.setText("AddedBy id :");

        studentAddedByTf.setEditable(false);

        javax.swing.GroupLayout studentDataPnlLayout = new javax.swing.GroupLayout(studentDataPnl);
        studentDataPnl.setLayout(studentDataPnlLayout);
        studentDataPnlLayout.setHorizontalGroup(
            studentDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDataPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentDataPnlLayout.createSequentialGroup()
                        .addComponent(studentIdLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentDataPnlLayout.createSequentialGroup()
                        .addComponent(studentNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentDataPnlLayout.createSequentialGroup()
                        .addComponent(studentPhoneLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(studentPhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentDataPnlLayout.createSequentialGroup()
                        .addComponent(studentAddedByLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentAddedByTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        studentDataPnlLayout.setVerticalGroup(
            studentDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDataPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(studentDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(studentDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(studentDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentPhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentPhoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(studentDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentAddedByLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentAddedByTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        ButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        ButtonsPnl.setAlignmentX(0.0F);
        ButtonsPnl.setAlignmentY(0.0F);

        setNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setNameBtn.setText("Set Name");
        setNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNameBtnActionPerformed(evt);
            }
        });

        setPhoneBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPhoneBtn.setText("Set Phone");
        setPhoneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPhoneBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteBtn.setText("Delete Student");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        setAddedByBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setAddedByBtn.setText("Set AddedBy");
        setAddedByBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setAddedByBtnActionPerformed(evt);
            }
        });

        setAddedByBtn1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setAddedByBtn1.setText("Other Operations");
        setAddedByBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setAddedByBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPnlLayout = new javax.swing.GroupLayout(ButtonsPnl);
        ButtonsPnl.setLayout(ButtonsPnlLayout);
        ButtonsPnlLayout.setHorizontalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setAddedByBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setPhoneBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(setAddedByBtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonsPnlLayout.setVerticalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNameBtn)
                    .addComponent(setPhoneBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(setAddedByBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setAddedByBtn1)
                .addGap(15, 15, 15))
        );

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Everest Training center");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addComponent(imgLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(studentsSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(studentsSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsTblMouseClicked
        int i = studentsTbl.getSelectedRow();
        TableModel tableModel = studentsTbl.getModel();
        try {
            selectedStudent = new Student((int) tableModel.getValueAt(i, 0));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,
                    "Selected Student doesn't Exist");
        }
        updateTable();
    }//GEN-LAST:event_studentsTblMouseClicked

    private void setNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String examName = JOptionPane.showInputDialog(
                rootPane, "New Student Name:", DISPOSE_ON_CLOSE);

        if (examName == null) {
            return;
        } else if (examName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    rootPane, "Student name can't be nothing");
            return;
        }

        try {
            selectedStudent.setName(examName);
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        updateTable();
    }//GEN-LAST:event_setNameBtnActionPerformed

    private boolean isBadSelection() throws HeadlessException {
        if (selectedStudent == null) {
            JOptionPane.showMessageDialog(rootPane,
                    "Choose a Student to make this opreation !");
            return true;
        }
        return false;
    }

    private void setPhoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPhoneBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        GUI_Util.promoteFormatedTextField("Change Student Phone",
                "Student New Phone :", PublicStaticFinals.PHONE_FORMAT,
                "Set Student Phone", (phone) -> {
                    try {
                        selectedStudent.setPhone(phone);
                        updateTable();
                        JOptionPane.showMessageDialog(rootPane, "Phone number"
                                + " change successfully");
                        return true;
                    } catch (SQLException | IllegalStateException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex);
                        return false;
                    }
                });
    }//GEN-LAST:event_setPhoneBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane
                .showConfirmDialog(rootPane,
                        "Are you sure you want delete Student "
                        + studentNameTf.getText() + " ?", "Student Delete",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedStudent.delete();
            selectedStudent = null;
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        updateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void setAddedByBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setAddedByBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        try {
            GUI_Util.promoteComboBox("Change Student AddedBy",
                    "Student New AddedBy :", "Set Student AddedBy",
                    GUI_Util.buildComboBoxModel(StudentUtil.getStudentsId()),
                    (AddedById) -> {
                        try {
                            selectedStudent.setAddedBy(
                                    Integer.parseInt(AddedById));
                            updateTable();
                            JOptionPane.showMessageDialog(rootPane,
                                    "Student AddedBy change successfully");
                            return true;
                        } catch (SQLException | IllegalStateException ex) {
                            JOptionPane.showMessageDialog(rootPane, ex);
                            return false;
                        }
                    });
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_setAddedByBtnActionPerformed

    private void setAddedByBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setAddedByBtn1ActionPerformed
        if (isBadSelection()) {
            return;
        }
        JFrame frame = new StudentsOperationsFrame(selectedStudent);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
    }//GEN-LAST:event_setAddedByBtn1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPnl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton setAddedByBtn;
    private javax.swing.JButton setAddedByBtn1;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JButton setPhoneBtn;
    private javax.swing.JLabel studentAddedByLbl;
    private javax.swing.JTextField studentAddedByTf;
    private javax.swing.JPanel studentDataPnl;
    private javax.swing.JLabel studentIdLbl;
    private javax.swing.JTextField studentIdTf;
    private javax.swing.JLabel studentNameLbl;
    private javax.swing.JTextField studentNameTf;
    private javax.swing.JLabel studentPhoneLbl;
    private javax.swing.JTextField studentPhoneTf;
    private javax.swing.JScrollPane studentsSPnl;
    private javax.swing.JTable studentsTbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.studentsTbl.setModel(
                    GUI_Util.buildTableModel(StudentUtil.getStudents()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        if (selectedStudent == null) {
            studentIdTf.setText("");
            studentNameTf.setText("");
            studentPhoneTf.setText("");
            studentAddedByTf.setText("");
        } else {
            studentIdTf.setText(String.valueOf(selectedStudent.getId()));
            studentNameTf.setText(selectedStudent.getName());
            studentPhoneTf.setText(selectedStudent.getPhone());
            studentAddedByTf.
                    setText(Integer.toString(selectedStudent.getAddedBy()));
        }
    }
}
