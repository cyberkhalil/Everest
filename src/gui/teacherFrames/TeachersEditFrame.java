package gui.teacherFrames;

import teachers.TeacherUtil;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import teachers.Teacher;
import utils.PublicStaticFinals;
import utils.gui.GUI_Util;

public class TeachersEditFrame extends javax.swing.JFrame {

    private Teacher selectedTeacher;

    public TeachersEditFrame() {
        initComponents();
        try {
            this.teachersTbl.setModel(
                    GUI_Util.buildTableModel(TeacherUtil.getTeachers()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teachersSPnl = new javax.swing.JScrollPane();
        teachersTbl = new javax.swing.JTable();
        teacherDataPnl = new javax.swing.JPanel();
        teacherNameLbl = new javax.swing.JLabel();
        teacherPhoneTf = new javax.swing.JTextField();
        teacherIdTf = new javax.swing.JTextField();
        teacherIdLbl = new javax.swing.JLabel();
        teacherPhoneLbl = new javax.swing.JLabel();
        teacherNameTf = new javax.swing.JTextField();
        ButtonsPnl = new javax.swing.JPanel();
        setNameBtn = new javax.swing.JButton();
        setPhoneBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        teachersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        teachersTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        teachersTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersTblMouseClicked(evt);
            }
        });
        teachersSPnl.setViewportView(teachersTbl);

        teacherDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        teacherDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        teacherNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        teacherNameLbl.setText("Teacher name :");

        teacherPhoneTf.setEditable(false);

        teacherIdTf.setEditable(false);

        teacherIdLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherIdLbl.setForeground(new java.awt.Color(0, 51, 153));
        teacherIdLbl.setText("Teacher ID   :");

        teacherPhoneLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherPhoneLbl.setForeground(new java.awt.Color(0, 51, 153));
        teacherPhoneLbl.setText("Teacher phone :");

        teacherNameTf.setEditable(false);

        javax.swing.GroupLayout teacherDataPnlLayout = new javax.swing.GroupLayout(teacherDataPnl);
        teacherDataPnl.setLayout(teacherDataPnlLayout);
        teacherDataPnlLayout.setHorizontalGroup(
            teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherDataPnlLayout.createSequentialGroup()
                .addGroup(teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherDataPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherDataPnlLayout.createSequentialGroup()
                                .addComponent(teacherIdLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(teacherIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherDataPnlLayout.createSequentialGroup()
                                .addComponent(teacherNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(teacherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(teacherDataPnlLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(teacherPhoneLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(teacherPhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        teacherDataPnlLayout.setVerticalGroup(
            teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherDataPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(teacherDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherPhoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherPhoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
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
        deleteBtn.setText("Delete Teacher");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPnlLayout = new javax.swing.GroupLayout(ButtonsPnl);
        ButtonsPnl.setLayout(ButtonsPnlLayout);
        ButtonsPnlLayout.setHorizontalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setPhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(deleteBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonsPnlLayout.setVerticalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNameBtn)
                    .addComponent(setPhoneBtn))
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addGap(31, 31, 31))
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
                    .addComponent(teacherDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(teachersSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teacherDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(teachersSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teachersTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersTblMouseClicked
        int i = teachersTbl.getSelectedRow();
        TableModel tableModel = teachersTbl.getModel();
        try {
            selectedTeacher = new Teacher((int) tableModel.getValueAt(i, 0));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,
                    "Selected Teacher doesn't Exist");
        }
        updateTable();
    }//GEN-LAST:event_teachersTblMouseClicked

    private void setNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String examName = JOptionPane.showInputDialog(
                rootPane, "New Teacher Name:", DISPOSE_ON_CLOSE);

        if (examName == null) {
            return;
        } else if (examName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    rootPane, "Teacher name can't be nothing");
            return;
        }

        try {
            selectedTeacher.setName(examName);
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        updateTable();
    }//GEN-LAST:event_setNameBtnActionPerformed

    private boolean isBadSelection() throws HeadlessException {
        if (selectedTeacher == null) {
            JOptionPane.showMessageDialog(rootPane,
                    "Choose a Teacher to make this opreation !");
            return true;
        }
        return false;
    }

    private void setPhoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPhoneBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        GUI_Util.promoteFormatedTextField("Change Teacher Phone",
                "Teacher New Phone :", PublicStaticFinals.PHONE_FORMAT,
                "Set Teacher Phone", (phone) -> {
                    try {
                        if (phone.isEmpty()) {
                            JOptionPane.showMessageDialog(rootPane,
                                    "Please enter a valid phone number");
                            return false;
                        }
                        selectedTeacher.setPhone(phone);
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
                        "Are you sure you want delete Teacher "
                        + teacherNameTf.getText() + " ?", "Teacher Delete",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedTeacher.delete();
            selectedTeacher = null;
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        updateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPnl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JButton setPhoneBtn;
    private javax.swing.JPanel teacherDataPnl;
    private javax.swing.JLabel teacherIdLbl;
    private javax.swing.JTextField teacherIdTf;
    private javax.swing.JLabel teacherNameLbl;
    private javax.swing.JTextField teacherNameTf;
    private javax.swing.JLabel teacherPhoneLbl;
    private javax.swing.JTextField teacherPhoneTf;
    private javax.swing.JScrollPane teachersSPnl;
    private javax.swing.JTable teachersTbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.teachersTbl.setModel(
                    GUI_Util.buildTableModel(TeacherUtil.getTeachers()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        if (selectedTeacher == null) {
            teacherIdTf.setText("");
            teacherNameTf.setText("");
            teacherPhoneTf.setText("");
        } else {
            teacherIdTf.setText(String.valueOf(selectedTeacher.getId()));
            teacherNameTf.setText(selectedTeacher.getName());
            teacherPhoneTf.setText(selectedTeacher.getPhone());
        }
    }
}
