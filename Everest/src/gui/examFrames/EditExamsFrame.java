package gui.examFrames;

import exams.Exam;
import exams.ExamUtil;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableModel;
import utils.GUI_Util;
import utils.Model;

public class EditExamsFrame extends javax.swing.JFrame {

    private Exam selectedExam;

    public EditExamsFrame() {
        initComponents();
        try {
            this.examsTable_T.setModel(
                    Model.buildTableModel(ExamUtil.getExams()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        examsTable_T = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        examDate_TF = new javax.swing.JTextField();
        examId_TF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        examName_TF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        examPrice_TF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        setName_B = new javax.swing.JButton();
        setDate_B = new javax.swing.JButton();
        deleteExam_B = new javax.swing.JButton();
        setPrice_B = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        examsTable_T.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        examsTable_T.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        examsTable_T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                examsTable_TMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(examsTable_T);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Exam name :");

        examDate_TF.setEditable(false);

        examId_TF.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Exam ID   :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Exam Date :");

        examName_TF.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Exam Price :");

        examPrice_TF.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(examId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(examName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(examDate_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(examPrice_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examDate_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examPrice_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);

        setName_B.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setName_B.setText("Set Name");
        setName_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setName_BActionPerformed(evt);
            }
        });

        setDate_B.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDate_B.setText("Set Date");
        setDate_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDate_BActionPerformed(evt);
            }
        });

        deleteExam_B.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteExam_B.setText("Delete Exam");
        deleteExam_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteExam_BActionPerformed(evt);
            }
        });

        setPrice_B.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPrice_B.setText("Set Price");
        setPrice_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPrice_BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setName_B, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setPrice_B, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteExam_B, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setDate_B, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setName_B)
                    .addComponent(setDate_B))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteExam_B)
                    .addComponent(setPrice_B))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void examsTable_TMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examsTable_TMouseClicked
        int i = examsTable_T.getSelectedRow();
        TableModel tableModel = examsTable_T.getModel();
        try {
            selectedExam = new Exam((int) tableModel.getValueAt(i, 0));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,
                    "Selected Exam doesn't Exist");
        }
        updateTable();
    }//GEN-LAST:event_examsTable_TMouseClicked

    private void setName_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setName_BActionPerformed
        if (checkSelection()) {
            return;
        }
        String examName = JOptionPane.showInputDialog(
                rootPane, "New Exam Name:", DISPOSE_ON_CLOSE);

        if (examName == null) {
            return;
        } else if (examName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    rootPane, "Exam name can't be nothing");
            return;
        }

        try {
            selectedExam.setName(examName);
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        updateTable();
    }//GEN-LAST:event_setName_BActionPerformed

    private boolean checkSelection() throws HeadlessException {
        if (selectedExam == null) {
            JOptionPane.showMessageDialog(rootPane,
                    "Choose a Exam to make this opreation !");
            return true;
        }
        return false;
    }

    private void setDate_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDate_BActionPerformed
        if (checkSelection()) {
            return;
        }
        PromoteExamDateFrame pExamDateFrame = new PromoteExamDateFrame();
        pExamDateFrame.setDateBtn.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    selectedExam.setTime(new Date(
                            pExamDateFrame.jXDatePicker1.getDateInMillis()));
                } catch (SQLException | IllegalStateException ex) {
                    JOptionPane.showMessageDialog(rootPane,
                            ex.getClass().getName() + "\n" + ex.getMessage());
                }
                updateTable();
                pExamDateFrame.dispose();
            }
        });
        pExamDateFrame.setDateBtn.setText("Set Date");
        pExamDateFrame.setVisible(true);
    }//GEN-LAST:event_setDate_BActionPerformed

    private void deleteExam_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteExam_BActionPerformed
        if (checkSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane
                .showConfirmDialog(rootPane,
                        "Are you sure you want delete Exam "
                        + examName_TF.getText() + " ?", "Exam Delete",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedExam.delete();
            selectedExam = null;
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        updateTable();
    }//GEN-LAST:event_deleteExam_BActionPerformed

    private void setPrice_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPrice_BActionPerformed
        if (checkSelection()) {
            return;
        }
        GUI_Util.promoteSpinner("Change Exam Price", "Exam New Price :",
                new SpinnerNumberModel(0, 0, 999.99, 10), "Set Price",
                (double spinnerValue) -> {
                    try {
                        selectedExam.setPrice(spinnerValue);
                        JOptionPane.showMessageDialog(rootPane,
                                "Exam Price Updated Successfully");
                        return true;
                    } catch (SQLException | IllegalStateException ex) {
                        JOptionPane.showMessageDialog(rootPane,
                                ex.getClass().getName() + "\n" + ex.getMessage());
                        return false;
                    }
                });
        updateTable();
    }//GEN-LAST:event_setPrice_BActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteExam_B;
    private javax.swing.JTextField examDate_TF;
    private javax.swing.JTextField examId_TF;
    private javax.swing.JTextField examName_TF;
    private javax.swing.JTextField examPrice_TF;
    private javax.swing.JTable examsTable_T;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton setDate_B;
    private javax.swing.JButton setName_B;
    private javax.swing.JButton setPrice_B;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.examsTable_T.setModel(
                    Model.buildTableModel(ExamUtil.getExams()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        if (selectedExam == null) {
            examId_TF.setText("");
            examName_TF.setText("");
            examPrice_TF.setText("");
            examDate_TF.setText("");
        } else {
            examId_TF.setText(String.valueOf(selectedExam.getId()));
            examName_TF.setText(selectedExam.getName());
            examPrice_TF.setText(String.valueOf(selectedExam.getPrice()));
            examDate_TF.setText(selectedExam.getTime().toString());
        }
    }
}
