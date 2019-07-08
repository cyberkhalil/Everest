package gui.teacherFrames;

import static courses.CourseUtil.getCoursesIdAndName;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import teachers.Teacher;
import static utils.ExceptionUtil.printEx;
import static utils.Strings.EVEREST_TITLE;
import static utils.Strings.SQL_EXCEPTION_MSG;
import static utils.gui.GUI_Util.buildComboBoxModel;
import static utils.gui.GUI_Util.displayItemsInJTable;
import static utils.gui.GUI_Util.buildTableModel;
import static utils.gui.GUI_Util.link_frame_to_button;
import static utils.gui.GUI_Util.promoteComboBox;
import static utils.gui.GUI_Util.promoteComboBoxAndSpinner;
import static utils.gui.GUI_Util.promoteSpinner;

public class TeacherOperationsFrame extends javax.swing.JFrame {

    private final Teacher selectedTeacher;

    public TeacherOperationsFrame(Teacher teacher) {
        this.selectedTeacher = teacher;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonsPnl = new javax.swing.JPanel();
        displayCoursesBtn = new javax.swing.JButton();
        addToCourseBtn = new javax.swing.JButton();
        removeFromCourseBtn = new javax.swing.JButton();
        giveMoneyBtn = new javax.swing.JButton();
        removeMoneyBtn = new javax.swing.JButton();
        displayBalanceBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        ButtonsPnl.setAlignmentX(0.0F);
        ButtonsPnl.setAlignmentY(0.0F);

        displayCoursesBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayCoursesBtn.setText("display courses");
        displayCoursesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCoursesBtnActionPerformed(evt);
            }
        });

        addToCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addToCourseBtn.setText("add to course");
        addToCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCourseBtnActionPerformed(evt);
            }
        });

        removeFromCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeFromCourseBtn.setText("remove from course");
        removeFromCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromCourseBtnActionPerformed(evt);
            }
        });

        giveMoneyBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        giveMoneyBtn.setText("Give Money");
        giveMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveMoneyBtnActionPerformed(evt);
            }
        });

        removeMoneyBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeMoneyBtn.setText("Remove Money");
        removeMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMoneyBtnActionPerformed(evt);
            }
        });

        displayBalanceBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayBalanceBtn.setText("Display Balance");
        displayBalanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBalanceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPnlLayout = new javax.swing.GroupLayout(ButtonsPnl);
        ButtonsPnl.setLayout(ButtonsPnlLayout);
        ButtonsPnlLayout.setHorizontalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addToCourseBtn)
                    .addComponent(giveMoneyBtn))
                .addGap(20, 20, 20)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayCoursesBtn)
                    .addComponent(displayBalanceBtn))
                .addGap(20, 20, 20)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeFromCourseBtn)
                    .addComponent(removeMoneyBtn))
                .addGap(20, 20, 20))
        );
        ButtonsPnlLayout.setVerticalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCourseBtn)
                    .addComponent(displayCoursesBtn)
                    .addComponent(removeFromCourseBtn))
                .addGap(18, 18, 18)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giveMoneyBtn)
                    .addComponent(removeMoneyBtn)
                    .addComponent(displayBalanceBtn))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText(EVEREST_TITLE);

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
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayCoursesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCoursesBtnActionPerformed
        link_frame_to_button(displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedTeacher.getCoursesFormated()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                printEx(ex);
            }
        }), displayCoursesBtn);
    }//GEN-LAST:event_displayCoursesBtnActionPerformed

    private void addToCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCourseBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBoxAndSpinner("Enroll to course",
                    "Choose course to enroll", buildComboBoxModel(getCoursesIdAndName()),
                    "Static teacher money", new SpinnerNumberModel(0, 0, 999.99, 1),
                    "Add to course", (choice, price) -> {
                        try {
                            selectedTeacher.enrollToCourse(Integer.parseInt(choice.substring(
                                    1, choice.indexOf(")"))), true, price);
                            JOptionPane.showMessageDialog(rootPane,
                                    "Teacher enrolled to this course successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), addToCourseBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_addToCourseBtnActionPerformed

    private void removeFromCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromCourseBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Course Remove", "Choose course to remove",
                    "remove course", buildComboBoxModel(selectedTeacher.getCoursesIdAndName()),
                    (choice) -> {
                        try {
                            selectedTeacher.removeFromCourse(Integer.parseInt(
                                    choice.substring(1, choice.indexOf(")"))));
                            JOptionPane.showMessageDialog(rootPane,
                                    "Teacher removed from this course successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), removeFromCourseBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_removeFromCourseBtnActionPerformed

    private void giveMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveMoneyBtnActionPerformed
        link_frame_to_button(promoteSpinner("Teacher Payment", "Payment Price :",
                new SpinnerNumberModel(0, 0, 999.99, 10), "Add Payment", (double spinnerValue) -> {
                    try {
                        selectedTeacher.giveMoney(spinnerValue);
                        JOptionPane.showMessageDialog(rootPane,
                                "Teacher Payment Done Successfully");
                        return true;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                    }
                    return false;
                }), giveMoneyBtn);
    }//GEN-LAST:event_giveMoneyBtnActionPerformed

    private void removeMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMoneyBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Purchase Remove", "Choose purchase to remove",
                    "Remove purchase", buildComboBoxModel(selectedTeacher.getPurchasesIdAndPrice()),
                    (choice) -> {
                        try {
                            selectedTeacher.removeGivenMoney(Integer.parseInt(
                                    choice.substring(4, choice.indexOf(")"))));
                            JOptionPane.showMessageDialog(rootPane,
                                    "Teacher purchase removed successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), removeMoneyBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_removeMoneyBtnActionPerformed

    private void displayBalanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBalanceBtnActionPerformed
        link_frame_to_button(displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedTeacher.getBalance()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                printEx(ex);
            }
        }), displayBalanceBtn);
    }//GEN-LAST:event_displayBalanceBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPnl;
    private javax.swing.JButton addToCourseBtn;
    private javax.swing.JButton displayBalanceBtn;
    private javax.swing.JButton displayCoursesBtn;
    private javax.swing.JButton giveMoneyBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton removeFromCourseBtn;
    private javax.swing.JButton removeMoneyBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
