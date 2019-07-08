package gui.examFrames;

import exams.ExamUtil;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static utils.ExceptionUtil.printEx;
import static utils.PublicStaticFinals.EVEREST_TITLE;
import static utils.PublicStaticFinals.SQL_EXCEPTION_MSG;

public class ExamAddFrame extends JFrame {

    public ExamAddFrame() {
        initComponents();
        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) examPriceSp.getEditor();
        JTextField textField = editor.getTextField();
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!textField.getText().matches("[0-9]*")) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Input MUST be only possitive numbers");
                    examPriceSp.setEditor(new JSpinner().getEditor());
                    examPriceSp.setEditor(editor);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        examNameTf = new javax.swing.JTextField();
        examNameLbl = new javax.swing.JLabel();
        examPriceLbl = new javax.swing.JLabel();
        examPriceSp = new javax.swing.JSpinner();
        examDateLbl = new javax.swing.JLabel();
        examDateDP = new org.jdesktop.swingx.JXDatePicker();
        addExamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(EVEREST_TITLE);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Add new exam");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titlePnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(titlePnlLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGroup(titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(titlePnlLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        examNameTf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        examNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        examNameLbl.setText("Exam name :");

        examPriceLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examPriceLbl.setForeground(new java.awt.Color(0, 51, 153));
        examPriceLbl.setText("Exam price :");

        examPriceSp.setModel(new SpinnerNumberModel(0,0,9999.99,10));

        examDateLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        examDateLbl.setForeground(new java.awt.Color(0, 51, 153));
        examDateLbl.setText("Exam Date :");

        examDateDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examDateDPActionPerformed(evt);
            }
        });

        addExamBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addExamBtn.setForeground(new java.awt.Color(0, 51, 153));
        addExamBtn.setText("Create new Exam");
        addExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExamBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(examDateLbl)
                            .addComponent(examPriceLbl)
                            .addComponent(examNameLbl))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(examPriceSp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(examDateDP, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addExamBtn)
                        .addGap(85, 85, 85)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examNameLbl)
                    .addComponent(examNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examPriceLbl)
                    .addComponent(examPriceSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examDateLbl)
                    .addComponent(examDateDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(addExamBtn)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExamBtnActionPerformed
        if (examNameTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Exam MUST have an exam name");
            return;
        }
        try {
            ExamUtil.createExam(examNameTf.getText(),
                    (double) examPriceSp.getValue(),
                    new Date(examDateDP.getDateInMillis()));

            JOptionPane.showMessageDialog(this, "New Exam created successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_addExamBtnActionPerformed

    private void examDateDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examDateDPActionPerformed
        if (examDateDP.getDateInMillis() < System.currentTimeMillis()) {
            JOptionPane.showMessageDialog(rootPane, "Exam Date MUST be after current date");
            examDateDP.setDateInMillis(System.currentTimeMillis());
        }
    }//GEN-LAST:event_examDateDPActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExamBtn;
    private org.jdesktop.swingx.JXDatePicker examDateDP;
    private javax.swing.JLabel examDateLbl;
    private javax.swing.JLabel examNameLbl;
    private javax.swing.JTextField examNameTf;
    private javax.swing.JLabel examPriceLbl;
    private javax.swing.JSpinner examPriceSp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
