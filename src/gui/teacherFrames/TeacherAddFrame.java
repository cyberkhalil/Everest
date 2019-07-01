package gui.teacherFrames;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import teachers.TeacherUtil;

public class TeacherAddFrame extends javax.swing.JFrame {

    public TeacherAddFrame() {
        initComponents();
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
        teacherNameLbl = new javax.swing.JLabel();
        teacherNameTf = new javax.swing.JTextField();
        teacherPhoneLbl = new javax.swing.JLabel();
        teacherPhoneFtf = new javax.swing.JFormattedTextField();

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
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
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

        contentTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contentTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        contentTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentTitleLbl.setText("Add a new teacher");

        addBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 51, 153));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        teacherNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        teacherNameLbl.setText("Teacher name:");

        teacherPhoneLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherPhoneLbl.setForeground(new java.awt.Color(0, 51, 153));
        teacherPhoneLbl.setText("Teacher Phone:");

        try {
            teacherPhoneFtf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        teacherPhoneFtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout contentPnlLayout = new javax.swing.GroupLayout(contentPnl);
        contentPnl.setLayout(contentPnlLayout);
        contentPnlLayout.setHorizontalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teacherNameLbl)
                            .addComponent(teacherPhoneLbl))
                        .addGap(28, 28, 28)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherPhoneFtf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        contentPnlLayout.setVerticalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentTitleLbl)
                .addGap(41, 41, 41)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherNameLbl)
                    .addComponent(teacherNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherPhoneLbl)
                    .addComponent(teacherPhoneFtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(addBtn)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        try {
            TeacherUtil.createTeacher(
                    teacherNameTf.getText(),
                    teacherPhoneFtf.getText());
            JOptionPane.showMessageDialog(this, "New Teacher created successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel contentPnl;
    private javax.swing.JLabel contentTitleLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel teacherNameLbl;
    private javax.swing.JTextField teacherNameTf;
    private javax.swing.JFormattedTextField teacherPhoneFtf;
    private javax.swing.JLabel teacherPhoneLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables
}
