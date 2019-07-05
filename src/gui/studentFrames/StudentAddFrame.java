package gui.studentFrames;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import static students.StudentUtil.createStudent;
import static utils.gui.GUI_Util.buildComboBoxModel;
import static students.StudentUtil.getStudentsIdAndName;

public class StudentAddFrame extends javax.swing.JFrame {

    public StudentAddFrame() {
        initComponents();
        try {
            studentAddedByIdCb.setModel(buildComboBoxModel(getStudentsIdAndName()));
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(rootPane, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        contentPnl = new javax.swing.JPanel();
        contentTitleLbl = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        studentNameLbl = new javax.swing.JLabel();
        studentNameTf = new javax.swing.JTextField();
        studentPhoneLbl = new javax.swing.JLabel();
        studentAddedByIdCb = new javax.swing.JComboBox<>();
        studentPhoneLbl1 = new javax.swing.JLabel();
        studentAddedByIdTb = new javax.swing.JToggleButton();
        studentPhoneFtf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        titleLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Everest Training Center");

        javax.swing.GroupLayout titlePnlLayout = new javax.swing.GroupLayout(titlePnl);
        titlePnl.setLayout(titlePnlLayout);
        titlePnlLayout.setHorizontalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contentPnl.setBackground(new java.awt.Color(255, 255, 255));
        contentPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 171, 112)));
        contentPnl.setMinimumSize(new java.awt.Dimension(415, 309));

        contentTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contentTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        contentTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentTitleLbl.setText("Add new student");

        addBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 51, 153));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        studentNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentNameLbl.setText("Student name:");

        studentPhoneLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentPhoneLbl.setForeground(new java.awt.Color(0, 51, 153));
        studentPhoneLbl.setText("Student Phone:");

        studentAddedByIdCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        studentPhoneLbl1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentPhoneLbl1.setForeground(new java.awt.Color(0, 51, 153));
        studentPhoneLbl1.setText("Student Added By Id:");

        studentAddedByIdTb.setText("OFF");
        studentAddedByIdTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAddedByIdTbActionPerformed(evt);
            }
        });

        try {
            studentPhoneFtf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        studentPhoneFtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout contentPnlLayout = new javax.swing.GroupLayout(contentPnl);
        contentPnl.setLayout(contentPnlLayout);
        contentPnlLayout.setHorizontalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studentPhoneLbl1)
                    .addComponent(studentNameLbl)
                    .addComponent(studentPhoneLbl))
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentAddedByIdCb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentAddedByIdTb))
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(studentPhoneFtf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        contentPnlLayout.setVerticalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentTitleLbl)
                .addGap(35, 35, 35)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentNameLbl)
                    .addComponent(studentNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentPhoneLbl)
                    .addComponent(studentPhoneFtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentAddedByIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentPhoneLbl1)
                    .addComponent(studentAddedByIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(addBtn)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(titlePnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (studentNameTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Student MUST have student name");
            return;
        }

        try {
            if (!studentAddedByIdTb.isSelected()) {
                String studentAddedById = studentAddedByIdCb.getSelectedObjects()[0].toString();
                createStudent(studentNameTf.getText(), studentPhoneFtf.getText(),
                        Integer.parseInt(studentAddedById.substring(1,
                                studentAddedById.indexOf(")"))));
            } else {
                createStudent(studentNameTf.getText(), studentPhoneFtf.getText());
            }
            JOptionPane.showMessageDialog(this, "New Student created successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void studentAddedByIdTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAddedByIdTbActionPerformed
        studentAddedByIdTb.setText(studentAddedByIdTb.isSelected() ? "ON" : "OFF");
    }//GEN-LAST:event_studentAddedByIdTbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel contentPnl;
    private javax.swing.JLabel contentTitleLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JComboBox<String> studentAddedByIdCb;
    private javax.swing.JToggleButton studentAddedByIdTb;
    private javax.swing.JLabel studentNameLbl;
    private javax.swing.JTextField studentNameTf;
    private javax.swing.JFormattedTextField studentPhoneFtf;
    private javax.swing.JLabel studentPhoneLbl;
    private javax.swing.JLabel studentPhoneLbl1;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables
}
