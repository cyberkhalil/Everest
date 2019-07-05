package gui.examFrames;

import exams.Exam;
import static exams.ExamUtil.getExamsFormated;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableModel;
import static utils.gui.GUI_Util.buildTableModel;
import static utils.gui.GUI_Util.link_frame_to_button;
import static utils.gui.GUI_Util.promoteDatePicker;
import static utils.gui.GUI_Util.promoteSpinner;

public class ExamsEditFrame extends javax.swing.JFrame {

    private Exam selectedExam;

    public ExamsEditFrame() {
        initComponents();
        try {
            this.examsTbl.setModel(buildTableModel(getExamsFormated()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        examsSPnl = new javax.swing.JScrollPane();
        examsTbl = new javax.swing.JTable();
        examDataPnl = new javax.swing.JPanel();
        examNameLbl = new javax.swing.JLabel();
        examDateTf = new javax.swing.JTextField();
        examIdTf = new javax.swing.JTextField();
        examIdLbl = new javax.swing.JLabel();
        examDateLbl = new javax.swing.JLabel();
        examNameTf = new javax.swing.JTextField();
        examPriceLbl = new javax.swing.JLabel();
        examPriceTf = new javax.swing.JTextField();
        examButtonsPnl = new javax.swing.JPanel();
        setNameBtn = new javax.swing.JButton();
        setDateBtn = new javax.swing.JButton();
        deleteExamBtn = new javax.swing.JButton();
        setPriceBtn = new javax.swing.JButton();
        otherOperationsBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        examsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        examsTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        examsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                examsTblMouseClicked(evt);
            }
        });
        examsSPnl.setViewportView(examsTbl);

        examDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        examDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        examNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        examNameLbl.setText("Exam name :");

        examDateTf.setEditable(false);

        examIdTf.setEditable(false);

        examIdLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examIdLbl.setForeground(new java.awt.Color(0, 51, 153));
        examIdLbl.setText("Exam ID   :");

        examDateLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examDateLbl.setForeground(new java.awt.Color(0, 51, 153));
        examDateLbl.setText("Exam Date :");

        examNameTf.setEditable(false);

        examPriceLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examPriceLbl.setForeground(new java.awt.Color(0, 51, 153));
        examPriceLbl.setText("Exam Price :");

        examPriceTf.setEditable(false);

        javax.swing.GroupLayout examDataPnlLayout = new javax.swing.GroupLayout(examDataPnl);
        examDataPnl.setLayout(examDataPnlLayout);
        examDataPnlLayout.setHorizontalGroup(
            examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examDataPnlLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examDataPnlLayout.createSequentialGroup()
                        .addComponent(examIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(examIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examDataPnlLayout.createSequentialGroup()
                        .addComponent(examNameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(examNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examDataPnlLayout.createSequentialGroup()
                            .addComponent(examDateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(examDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examDataPnlLayout.createSequentialGroup()
                            .addComponent(examPriceLbl)
                            .addGap(18, 18, 18)
                            .addComponent(examPriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        examDataPnlLayout.setVerticalGroup(
            examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examDataPnlLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examPriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examPriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        examButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        examButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        examButtonsPnl.setAlignmentX(0.0F);
        examButtonsPnl.setAlignmentY(0.0F);

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

        deleteExamBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteExamBtn.setText("Delete Exam");
        deleteExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteExamBtnActionPerformed(evt);
            }
        });

        setPriceBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPriceBtn.setText("Set Price");
        setPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPriceBtnActionPerformed(evt);
            }
        });

        otherOperationsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        otherOperationsBtn.setText("Other Operations");
        otherOperationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherOperationsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout examButtonsPnlLayout = new javax.swing.GroupLayout(examButtonsPnl);
        examButtonsPnl.setLayout(examButtonsPnlLayout);
        examButtonsPnlLayout.setHorizontalGroup(
            examButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examButtonsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(examButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setPriceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(examButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setDateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(examButtonsPnlLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(otherOperationsBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        examButtonsPnlLayout.setVerticalGroup(
            examButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(examButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNameBtn)
                    .addComponent(setDateBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(examButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteExamBtn)
                    .addComponent(setPriceBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(otherOperationsBtn)
                .addContainerGap(14, Short.MAX_VALUE))
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
                .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titleLbl))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(examDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(examButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(examsSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(examDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(examButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(examsSPnl)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void examsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examsTblMouseClicked
        int i = examsTbl.getSelectedRow();
        TableModel tableModel = examsTbl.getModel();
        try {
            selectedExam = new Exam(Integer.parseInt(tableModel.getValueAt(i, 0).toString()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Selected Exam doesn't Exist");
        }
        updateTable();
    }//GEN-LAST:event_examsTblMouseClicked

    private void setNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String examName = (String) JOptionPane.showInputDialog(rootPane, "New Exam Name:",
                "Set Exam Name", JOptionPane.QUESTION_MESSAGE, null, null, selectedExam.getName());

        if (examName == null) {
            return;
        } else if (examName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Exam name can't be nothing");
            return;
        }

        try {
            selectedExam.setName(examName);
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        updateTable();
    }//GEN-LAST:event_setNameBtnActionPerformed

    private void setDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDateBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        link_frame_to_button(promoteDatePicker("Change Exam Date",
                "Exam New Date :", "Set Exam Date", (DateInMillis) -> {
                    try {
                        selectedExam.setTime(new Date(DateInMillis));
                        JOptionPane.showMessageDialog(rootPane, "Exam Date Updated Successfully");
                        updateTable();
                        return true;
                    } catch (IllegalStateException | SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex);
                    }
                    return false;
                }), setDateBtn);

    }//GEN-LAST:event_setDateBtnActionPerformed

    private void deleteExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteExamBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane.showConfirmDialog(rootPane,
                "Are you sure you want delete Exam " + examNameTf.getText() + " ?", "Exam Delete",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedExam.delete();
            selectedExam = null;
        } catch (SQLException | IllegalStateException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        updateTable();
    }//GEN-LAST:event_deleteExamBtnActionPerformed

    private void setPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPriceBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        link_frame_to_button(promoteSpinner("Change Exam Price", "Exam New Price :",
                new SpinnerNumberModel(0, 0, 999.99, 10), "Set Price", (double spinnerValue) -> {
                    try {
                        selectedExam.setPrice(spinnerValue);
                        JOptionPane.showMessageDialog(rootPane, "Exam Price Updated Successfully");
                        return true;
                    } catch (SQLException | IllegalStateException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex);
                        return false;
                    }
                }), setPriceBtn);
        updateTable();
    }//GEN-LAST:event_setPriceBtnActionPerformed

    private void otherOperationsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherOperationsBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        JFrame frame = new ExamOperationsFrame(selectedExam);
        link_frame_to_button(frame, otherOperationsBtn);
        frame.setVisible(true);
    }//GEN-LAST:event_otherOperationsBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteExamBtn;
    private javax.swing.JPanel examButtonsPnl;
    private javax.swing.JPanel examDataPnl;
    private javax.swing.JLabel examDateLbl;
    private javax.swing.JTextField examDateTf;
    private javax.swing.JLabel examIdLbl;
    private javax.swing.JTextField examIdTf;
    private javax.swing.JLabel examNameLbl;
    private javax.swing.JTextField examNameTf;
    private javax.swing.JLabel examPriceLbl;
    private javax.swing.JTextField examPriceTf;
    private javax.swing.JScrollPane examsSPnl;
    private javax.swing.JTable examsTbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton otherOperationsBtn;
    private javax.swing.JButton setDateBtn;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JButton setPriceBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.examsTbl.setModel(buildTableModel(getExamsFormated()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        if (selectedExam == null) {
            examIdTf.setText("");
            examNameTf.setText("");
            examPriceTf.setText("");
            examDateTf.setText("");
        } else {
            examIdTf.setText(String.valueOf(selectedExam.getId()));
            examNameTf.setText(selectedExam.getName());
            examPriceTf.setText(String.valueOf(selectedExam.getPrice()));
            examDateTf.setText(selectedExam.getTime().toString());
        }
    }

    private boolean isBadSelection() throws HeadlessException {
        if (selectedExam == null) {
            JOptionPane.showMessageDialog(rootPane, "Choose a Exam to make this opreation !");
            return true;
        }
        return false;
    }
}
