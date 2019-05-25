package gui.courseFrames;

import courses.Course;
import courses.CourseUtil;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableModel;
import utils.GUI_Util;
import utils.Model;

public class CoursesEditFrame extends javax.swing.JFrame {

    private Course selectedCourse;

    public CoursesEditFrame() {
        initComponents();
        try {
            this.coursesTbl.setModel(
                    Model.buildTableModel(CourseUtil.getCourses()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coursesSPnl = new javax.swing.JScrollPane();
        coursesTbl = new javax.swing.JTable();
        courseDataPnl = new javax.swing.JPanel();
        courseNameLbl = new javax.swing.JLabel();
        courseDateTf = new javax.swing.JTextField();
        courseIdTf = new javax.swing.JTextField();
        courseIdLbl = new javax.swing.JLabel();
        courseDateLbl = new javax.swing.JLabel();
        courseNameTf = new javax.swing.JTextField();
        coursePriceLbl = new javax.swing.JLabel();
        coursePriceTf = new javax.swing.JTextField();
        courseButtonsPnl = new javax.swing.JPanel();
        setNameBtn = new javax.swing.JButton();
        setDateBtn = new javax.swing.JButton();
        deleteCourseBtn = new javax.swing.JButton();
        setPriceBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        coursesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        coursesTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        coursesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesTblMouseClicked(evt);
            }
        });
        coursesSPnl.setViewportView(coursesTbl);

        courseDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        courseDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        courseNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseNameLbl.setText("Course name :");

        courseDateTf.setEditable(false);

        courseIdTf.setEditable(false);

        courseIdLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseIdLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseIdLbl.setText("Course ID   :");

        courseDateLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseDateLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseDateLbl.setText("Course Date :");

        courseNameTf.setEditable(false);

        coursePriceLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        coursePriceLbl.setForeground(new java.awt.Color(0, 51, 153));
        coursePriceLbl.setText("Course Price :");

        coursePriceTf.setEditable(false);

        javax.swing.GroupLayout courseDataPnlLayout = new javax.swing.GroupLayout(courseDataPnl);
        courseDataPnl.setLayout(courseDataPnlLayout);
        courseDataPnlLayout.setHorizontalGroup(
            courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseDataPnlLayout.createSequentialGroup()
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseDataPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseDataPnlLayout.createSequentialGroup()
                                .addComponent(courseIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(courseIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseDataPnlLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(courseNameLbl)
                                .addGap(18, 18, 18)
                                .addComponent(courseNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(courseDataPnlLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(courseDateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(courseDataPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(coursePriceLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(coursePriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        courseDataPnlLayout.setVerticalGroup(
            courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseDataPnlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursePriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursePriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        courseButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        courseButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        courseButtonsPnl.setAlignmentX(0.0F);
        courseButtonsPnl.setAlignmentY(0.0F);

        setNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setNameBtn.setText("Set Name");
        setNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNameBtnActionPerformed(evt);
            }
        });

        setDateBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDateBtn.setText("Set Date");
        setDateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDateBtnActionPerformed(evt);
            }
        });

        deleteCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteCourseBtn.setText("Delete Exam");
        deleteCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        setPriceBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPriceBtn.setText("Set Price");
        setPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPriceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout courseButtonsPnlLayout = new javax.swing.GroupLayout(courseButtonsPnl);
        courseButtonsPnl.setLayout(courseButtonsPnlLayout);
        courseButtonsPnlLayout.setHorizontalGroup(
            courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseButtonsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setPriceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setDateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        courseButtonsPnlLayout.setVerticalGroup(
            courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseButtonsPnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNameBtn)
                    .addComponent(setDateBtn))
                .addGap(18, 18, 18)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCourseBtn)
                    .addComponent(setPriceBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(courseDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(coursesSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(courseDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(coursesSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coursesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesTblMouseClicked
        int i = coursesTbl.getSelectedRow();
        TableModel tableModel = coursesTbl.getModel();
        try {
            selectedCourse = new Course((int) tableModel.getValueAt(i, 0));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,
                    "Selected Course doesn't Exist");
        }
        updateTable();
    }//GEN-LAST:event_coursesTblMouseClicked

    private void setNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String courseName = JOptionPane.showInputDialog(
                rootPane, "New Course Name:", DISPOSE_ON_CLOSE);

        if (courseName == null) {
            return;
        } else if (courseName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    rootPane, "Course name can't be nothing");
            return;
        }

        try {
            selectedCourse.setName(courseName);
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        updateTable();
    }//GEN-LAST:event_setNameBtnActionPerformed

    private boolean isBadSelection() throws HeadlessException {
        if (selectedCourse == null) {
            JOptionPane.showMessageDialog(rootPane,
                    "Choose a Course to make this opreation !");
            return true;
        }
        return false;
    }

    private void setDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDateBtnActionPerformed
        if (isBadSelection()) {
        }
        // TODO !
    }//GEN-LAST:event_setDateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane
                .showConfirmDialog(rootPane,
                        "Are you sure you want delete Course "
                        + courseNameTf.getText() + " ?", "Course Delete",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedCourse.delete();
            selectedCourse = null;
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        updateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void setPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPriceBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        GUI_Util.promoteSpinner("Change Course Price", "Course New Price :",
                new SpinnerNumberModel(0, 0, 999.99, 10), "Set Price",
                (double spinnerValue) -> {
                    try {
                        selectedCourse.setPrice(spinnerValue);
                        JOptionPane.showMessageDialog(rootPane,
                                "Course Price Updated Successfully");
                        return true;
                    } catch (SQLException | IllegalStateException ex) {
                        JOptionPane.showMessageDialog(rootPane,
                                ex.getClass().getName() + "\n" + ex.getMessage());
                        return false;
                    }
                });
        updateTable();
    }//GEN-LAST:event_setPriceBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel courseButtonsPnl;
    private javax.swing.JPanel courseDataPnl;
    private javax.swing.JLabel courseDateLbl;
    private javax.swing.JTextField courseDateTf;
    private javax.swing.JLabel courseIdLbl;
    private javax.swing.JTextField courseIdTf;
    private javax.swing.JLabel courseNameLbl;
    private javax.swing.JTextField courseNameTf;
    private javax.swing.JLabel coursePriceLbl;
    private javax.swing.JTextField coursePriceTf;
    private javax.swing.JScrollPane coursesSPnl;
    private javax.swing.JTable coursesTbl;
    private javax.swing.JButton deleteCourseBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton setDateBtn;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JButton setPriceBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.coursesTbl.setModel(
                    Model.buildTableModel(CourseUtil.getCourses()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        if (selectedCourse == null) {
            courseIdTf.setText("");
            courseNameTf.setText("");
            coursePriceTf.setText("");
            courseDateTf.setText("");
        } else {
            courseIdTf.setText(String.valueOf(selectedCourse.getID()));
            courseNameTf.setText(selectedCourse.getName());
            coursePriceTf.setText(String.valueOf(selectedCourse.getPrice()));
        }
    }
}
