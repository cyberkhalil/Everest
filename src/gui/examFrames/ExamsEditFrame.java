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
import utils.gui.GUI_Util;

public class ExamsEditFrame extends javax.swing.JFrame {

    private Exam selectedExam;

    public ExamsEditFrame() {
        initComponents();
        try {
            this.examsTbl.setModel(
                    GUI_Util.buildTableModel(ExamUtil.getExams()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
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
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examDataPnlLayout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examDataPnlLayout.createSequentialGroup()
                                .addComponent(examIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(examIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examDataPnlLayout.createSequentialGroup()
                                .addComponent(examNameLbl)
                                .addGap(18, 18, 18)
                                .addComponent(examNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(examDataPnlLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(examDateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(examDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(examDataPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(examPriceLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(examPriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        examDataPnlLayout.setVerticalGroup(
            examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examDataPnlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(examDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examPriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examPriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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
        );
        examButtonsPnlLayout.setVerticalGroup(
            examButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examButtonsPnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(examButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNameBtn)
                    .addComponent(setDateBtn))
                .addGap(18, 18, 18)
                .addGroup(examButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteExamBtn)
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
                    .addComponent(examDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(examButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(examsSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(examDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(examButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(examsSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void examsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_examsTblMouseClicked
        int i = examsTbl.getSelectedRow();
        TableModel tableModel = examsTbl.getModel();
        try {
            selectedExam = new Exam((int) tableModel.getValueAt(i, 0));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,
                    "Selected Exam doesn't Exist");
        }
        updateTable();
    }//GEN-LAST:event_examsTblMouseClicked

    private void setNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameBtnActionPerformed
        if (isBadSelection()) {
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
    }//GEN-LAST:event_setNameBtnActionPerformed

    private boolean isBadSelection() throws HeadlessException {
        if (selectedExam == null) {
            JOptionPane.showMessageDialog(rootPane,
                    "Choose a Exam to make this opreation !");
            return true;
        }
        return false;
    }

    private void setDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDateBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        ExamDatePromoteFrame pExamDateFrame = new ExamDatePromoteFrame();
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
    }//GEN-LAST:event_setDateBtnActionPerformed

    private void deleteExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteExamBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane
                .showConfirmDialog(rootPane,
                        "Are you sure you want delete Exam "
                        + examNameTf.getText() + " ?", "Exam Delete",
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
    }//GEN-LAST:event_deleteExamBtnActionPerformed

    private void setPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPriceBtnActionPerformed
        if (isBadSelection()) {
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
    }//GEN-LAST:event_setPriceBtnActionPerformed

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
    private javax.swing.JButton setDateBtn;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JButton setPriceBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.examsTbl.setModel(
                    GUI_Util.buildTableModel(ExamUtil.getExams()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getClass().getName()
                    + "\n" + ex.getMessage()
            );
        }
        if (selectedExam == null) {
            examIdTf.setText("");
            examNameTf.setText("");
            examPriceTf.setText("");
            examDateTf.setText("");
        } else {
            examIdTf.setText(String.valueOf(selectedExam.getID()));
            examNameTf.setText(selectedExam.getName());
            examPriceTf.setText(String.valueOf(selectedExam.getPrice()));
            examDateTf.setText(selectedExam.getTime().toString());
        }
    }
}
