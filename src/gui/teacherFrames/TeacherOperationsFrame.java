package gui.teacherFrames;

import static courses.CourseUtil.getCoursesIdAndName;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import teachers.Teacher;
import utils.gui.GUI_Util;
import static utils.gui.GUI_Util.buildComboBoxModel;
import static utils.gui.GUI_Util.displayItemsInJTable;
import static utils.gui.GUI_Util.buildTableModel;
import static utils.gui.GUI_Util.link_frame_to_button;
import static utils.gui.GUI_Util.promoteComboBox;
import static utils.gui.GUI_Util.promoteComboBoxAndTwoOrSpinners;

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

        javax.swing.GroupLayout ButtonsPnlLayout = new javax.swing.GroupLayout(ButtonsPnl);
        ButtonsPnl.setLayout(ButtonsPnlLayout);
        ButtonsPnlLayout.setHorizontalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addToCourseBtn)
                .addGap(20, 20, 20)
                .addComponent(displayCoursesBtn)
                .addGap(20, 20, 20)
                .addComponent(removeFromCourseBtn)
                .addGap(20, 20, 20))
        );
        ButtonsPnlLayout.setVerticalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCourseBtn)
                    .addComponent(displayCoursesBtn)
                    .addComponent(removeFromCourseBtn))
                .addContainerGap(91, Short.MAX_VALUE))
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
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }), displayCoursesBtn);
    }//GEN-LAST:event_displayCoursesBtnActionPerformed

    private void addToCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCourseBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBoxAndTwoOrSpinners("Enroll to course",
                    "Choose course to enroll", buildComboBoxModel(getCoursesIdAndName()),
                    "Static teacher money", new SpinnerNumberModel(0, 0, 999.99, 1),
                    "Percentage teacher money", new SpinnerNumberModel(0, 0, 100, 1),
                    "Static teacher money", "Percentage teacher money", "Add to course",
                    (choice, first, price) -> {
                        try {
                            selectedTeacher.enrollToCourse(Integer.parseInt(choice.substring(
                                    1, choice.indexOf(")"))), first, price);
                            JOptionPane.showMessageDialog(rootPane,
                                    "Teacher enrolled to this course successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, ex);
                        }
                        return false;
                    }), addToCourseBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
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
                            JOptionPane.showMessageDialog(rootPane, ex);
                        }
                        return false;
                    }), removeFromCourseBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_removeFromCourseBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPnl;
    private javax.swing.JButton addToCourseBtn;
    private javax.swing.JButton displayCoursesBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton removeFromCourseBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
