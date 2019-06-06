package gui.userFrames;

import gui.loginFrames.Login;
import java.sql.SQLException;
import javax.naming.NoPermissionException;
import javax.swing.JOptionPane;
import static users.UserUtil.createUser;

public class UserAddFrame extends javax.swing.JFrame {

    public UserAddFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPrivilegeBG = new javax.swing.ButtonGroup();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        contentPnl = new javax.swing.JPanel();
        contentTitleLbl = new javax.swing.JLabel();
        userAddBtn = new javax.swing.JButton();
        userNameLbl = new javax.swing.JLabel();
        userPasswordLbl = new javax.swing.JLabel();
        userPasswordPf = new javax.swing.JPasswordField();
        userPasswordConfirmLbl = new javax.swing.JLabel();
        userNameTf = new javax.swing.JTextField();
        userPasswordConfirmPf = new javax.swing.JPasswordField();
        userAdminPrivilegeRB = new javax.swing.JRadioButton();
        userNormalPrivilegeRB = new javax.swing.JRadioButton();
        userPrivilegeLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        contentPnl.setBackground(new java.awt.Color(255, 255, 255));
        contentPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 171, 112)));

        contentTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contentTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        contentTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentTitleLbl.setText("Add new user");

        userAddBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userAddBtn.setForeground(new java.awt.Color(0, 51, 153));
        userAddBtn.setText("Add User");
        userAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAddBtnActionPerformed(evt);
            }
        });

        userNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        userNameLbl.setText("Username:");

        userPasswordLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userPasswordLbl.setForeground(new java.awt.Color(0, 51, 153));
        userPasswordLbl.setText("Password:");

        userPasswordConfirmLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userPasswordConfirmLbl.setForeground(new java.awt.Color(0, 51, 153));
        userPasswordConfirmLbl.setText("Confirm Password:");

        userPrivilegeBG.add(userAdminPrivilegeRB);
        userAdminPrivilegeRB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userAdminPrivilegeRB.setText("Admin");

        userPrivilegeBG.add(userNormalPrivilegeRB);
        userNormalPrivilegeRB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userNormalPrivilegeRB.setText("Normal user");

        userPrivilegeLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userPrivilegeLbl.setForeground(new java.awt.Color(0, 51, 153));
        userPrivilegeLbl.setText("Privilege :");

        javax.swing.GroupLayout contentPnlLayout = new javax.swing.GroupLayout(contentPnl);
        contentPnl.setLayout(contentPnlLayout);
        contentPnlLayout.setHorizontalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userAdminPrivilegeRB)
                    .addComponent(userNormalPrivilegeRB)
                    .addComponent(userPrivilegeLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(userPasswordConfirmPf)
                            .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userPasswordConfirmLbl)
                                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userPasswordLbl)
                                    .addComponent(userNameLbl)
                                    .addComponent(userPasswordPf)
                                    .addComponent(userNameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                        .addComponent(userAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        contentPnlLayout.setVerticalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addComponent(contentTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userPasswordLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPasswordPf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userPasswordConfirmLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPasswordConfirmPf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userPrivilegeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userAdminPrivilegeRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNormalPrivilegeRB)
                .addGap(18, 18, 18)
                .addComponent(userAddBtn)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAddBtnActionPerformed

        String userPassword = new String(userPasswordPf.getPassword());
        boolean passwordConfirmed
                = new String(userPasswordConfirmPf.
                        getPassword()).equals(userPassword);
        if (passwordConfirmed) {
            String userName = userNameTf.getText();
            String userPrivilege = userPrivilegeBG.getSelection()
                    .equals(userAdminPrivilegeRB.getModel())
                    ? "Admin" : "Normal User";

            try {
                createUser(Login.user, userName, userPassword, userPrivilege);
                JOptionPane.showMessageDialog(rootPane,
                        "User has been added sucessfully");
            } catch (SQLException | NoPermissionException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        }
    }//GEN-LAST:event_userAddBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPnl;
    private javax.swing.JLabel contentTitleLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    private javax.swing.JButton userAddBtn;
    private javax.swing.JRadioButton userAdminPrivilegeRB;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTf;
    private javax.swing.JRadioButton userNormalPrivilegeRB;
    private javax.swing.JLabel userPasswordConfirmLbl;
    private javax.swing.JPasswordField userPasswordConfirmPf;
    private javax.swing.JLabel userPasswordLbl;
    private javax.swing.JPasswordField userPasswordPf;
    private javax.swing.ButtonGroup userPrivilegeBG;
    private javax.swing.JLabel userPrivilegeLbl;
    // End of variables declaration//GEN-END:variables
}
