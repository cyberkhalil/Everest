
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddNewPayment extends javax.swing.JFrame {

    Connection conn = DBConnection.getConnection();
    ArrayList<Integer> ids = new ArrayList<>();
    userEntry us = new userEntry();

    public AddNewPayment() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        BookPanel.setVisible(false);
        CoursePanel.setVisible(false);
        ExamPanel.setVisible(false);
        BookRadioBtn.setActionCommand("Book");
        CourseRadioBtn.setActionCommand("Course");
        ExamRadioBtn.setActionCommand("Exam");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        paymentValue = new javax.swing.JTextField();
        ShowLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BookRadioBtn = new javax.swing.JRadioButton();
        CourseRadioBtn = new javax.swing.JRadioButton();
        ExamRadioBtn = new javax.swing.JRadioButton();
        BookPanel = new javax.swing.JPanel();
        BookComboBox = new javax.swing.JComboBox<>();
        CoursePanel = new javax.swing.JPanel();
        courseComboBox = new javax.swing.JComboBox<>();
        ExamPanel = new javax.swing.JPanel();
        examComboBox = new javax.swing.JComboBox<>();
        InvoiceBox = new javax.swing.JCheckBox();
        AddPaymentBtn = new javax.swing.JButton();
        ShowPaymentsBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        PaymentTypeComboBox = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Everest Training Center ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 172, 112)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add new payment");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Student ID number :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Payment Value:");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Paying for:");

        buttonGroup1.add(BookRadioBtn);
        BookRadioBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BookRadioBtn.setForeground(new java.awt.Color(0, 51, 153));
        BookRadioBtn.setText("Book");
        BookRadioBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BookRadioBtnItemStateChanged(evt);
            }
        });
        BookRadioBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BookRadioBtnStateChanged(evt);
            }
        });
        BookRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(CourseRadioBtn);
        CourseRadioBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CourseRadioBtn.setForeground(new java.awt.Color(0, 51, 153));
        CourseRadioBtn.setText("Course");
        CourseRadioBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CourseRadioBtnItemStateChanged(evt);
            }
        });
        CourseRadioBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CourseRadioBtnStateChanged(evt);
            }
        });

        buttonGroup1.add(ExamRadioBtn);
        ExamRadioBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ExamRadioBtn.setForeground(new java.awt.Color(0, 51, 153));
        ExamRadioBtn.setText("Exam");
        ExamRadioBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ExamRadioBtnItemStateChanged(evt);
            }
        });
        ExamRadioBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ExamRadioBtnStateChanged(evt);
            }
        });

        BookPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BookPanelLayout = new javax.swing.GroupLayout(BookPanel);
        BookPanel.setLayout(BookPanelLayout);
        BookPanelLayout.setHorizontalGroup(
            BookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BookComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BookPanelLayout.setVerticalGroup(
            BookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BookPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BookComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CoursePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CoursePanelLayout = new javax.swing.GroupLayout(CoursePanel);
        CoursePanel.setLayout(CoursePanelLayout);
        CoursePanelLayout.setHorizontalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CoursePanelLayout.setVerticalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CoursePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ExamPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ExamPanelLayout = new javax.swing.GroupLayout(ExamPanel);
        ExamPanel.setLayout(ExamPanelLayout);
        ExamPanelLayout.setHorizontalGroup(
            ExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExamPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(examComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ExamPanelLayout.setVerticalGroup(
            ExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExamPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(examComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        InvoiceBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        InvoiceBox.setForeground(new java.awt.Color(0, 51, 153));
        InvoiceBox.setText("Generate an invoice");
        InvoiceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceBoxActionPerformed(evt);
            }
        });

        AddPaymentBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddPaymentBtn.setForeground(new java.awt.Color(0, 51, 153));
        AddPaymentBtn.setText("Add payment");
        AddPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPaymentBtnActionPerformed(evt);
            }
        });

        ShowPaymentsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ShowPaymentsBtn.setForeground(new java.awt.Color(0, 51, 153));
        ShowPaymentsBtn.setText("Show previous payments");
        ShowPaymentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPaymentsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InvoiceBox)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(BookRadioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(ExamRadioBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ExamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(CourseRadioBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CoursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(AddPaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowPaymentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(CoursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BookRadioBtn)
                        .addGap(4, 4, 4)
                        .addComponent(CourseRadioBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExamRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(InvoiceBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddPaymentBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowPaymentsBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Payment Type:");

        PaymentTypeComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PaymentTypeComboBox.setForeground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(paymentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(PaymentTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(ShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaymentTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPaymentBtnActionPerformed
        try {
            String Item = buttonGroup1.getSelection().getActionCommand();
            int id = Integer.parseInt(IDField.toString());
            double paymentvalue = Double.parseDouble(paymentValue.getText());
            int ItemID = this.getItemID(Item, id);
            double Net = 0;
            int PayID = 0;
            String ItemPaymentsAreCompleted = "";
            if (Item.equals("Book")) {
                String Bookname = BookComboBox.getSelectedItem().toString();

            } else if (Item.equals("Course")) {
                String Coursename = courseComboBox.getSelectedItem().toString();

            } else if (Item.equals("Exam")) {
                String Examname = examComboBox.getSelectedItem().toString();

            }
            if (ItemPaymentsAreCompleted.equals("Yes")) {
                JOptionPane.showMessageDialog(null, "Selected Item is Already Paid");
            } else if (ItemPaymentsAreCompleted.equals("No")) {
                //------------ Queries;
                String query = "select max(PaymentNo) as Paymentid from payments where StdID = ?";
                PreparedStatement psx = conn.prepareStatement(query);
                psx.setInt(1, id);
                ResultSet rsx = psx.executeQuery();
                while (rsx.next()) {
                    PayID = rsx.getInt("Paymentid");
                }
                String query1 = "select Net from payments where PaymentNo = ? ";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, PayID);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Net = rs.getDouble("Net");
                }
                String query2 = "insert into payments (StdID,paymentValue) values (?,?)";
                PreparedStatement ps2 = conn.prepareStatement(query2);
                ps2.setInt(1, id);
                ps2.setDouble(2, paymentvalue);
                ps2.execute();

                String query3 = "select sum(paymentValue)as paymentValues from payments where StdID = ?";
                PreparedStatement ps3 = conn.prepareStatement(query3);
                ps3.setInt(1, id);
                double paymentvalues = 0;
                ResultSet rs2 = ps3.executeQuery();
                while (rs2.next()) {
                    paymentvalues = rs2.getDouble("paymentValues");
                }
                double remainedCash = Net - paymentvalues;
                int paymentID = us.getMaxPaymentID();

                String query4 = "insert into payment_item (PaymentID,Item,ItemID) values (?,?,?)";
                PreparedStatement ps4 = conn.prepareStatement(query4);
                ps4.setInt(1, paymentID);
                ps4.setString(2, Item);
                ps4.setInt(3, ItemID);
                ps4.execute();

                String query5 = "select max(PaymentNo) as Paymentid from payments where StdID = ?";
                PreparedStatement ps5 = conn.prepareStatement(query5);
                ps5.setInt(1, id);
                ResultSet rs5 = ps5.executeQuery();
                while (rs5.next()) {
                    PayID = rs5.getInt("Paymentid");
                }
                String query6 = "update payments set remaindCash = ?,Net= ? where PaymentNo = ? ";
                PreparedStatement ps6 = conn.prepareStatement(query6);
                ps6.setDouble(1, remainedCash);
                ps6.setDouble(2, Net);
                ps6.setInt(3, PayID);
                ps6.executeUpdate();
                int price = 0;

                if (Item.equals("Book")) {
                    String queryBook = "select Price from book where BookId = ?";
                    PreparedStatement psB = conn.prepareStatement(queryBook);
                    psB.setInt(1, ItemID);
                    ResultSet rsB = psB.executeQuery();
                    while (rsB.next()) {
                        price = rsB.getInt("Price");
                    }
                    //check if the price equals the sum of payments for the item
                    if (price == paymentvalues) {
                        String query9 = "update payment_item set PaidFor = ? where ItemID = ? ";
                        PreparedStatement ps9 = conn.prepareStatement(query9);
                        ps9.setString(1, "Yes");
                        ps9.setInt(2, ItemID);
                        ps9.executeUpdate();
                    }
                } else if (Item.equals("Course")) {
                    String queryCourse = "select CoursePrice from course where CourseId = ?";
                    PreparedStatement psB = conn.prepareStatement(queryCourse);
                    psB.setInt(1, ItemID);
                    ResultSet rsB = psB.executeQuery();
                    while (rsB.next()) {
                        price = rsB.getInt("Price");
                    }
                    if (price == paymentvalues) {
                        String query9 = "update payment_item set PaidFor = ? where ItemID = ? ";
                        PreparedStatement ps9 = conn.prepareStatement(query9);
                        ps9.setString(1, "Yes");
                        ps9.setInt(2, ItemID);
                        ps9.executeUpdate();
                    }
                } else if (Item.equals("Exam")) {
                    String queryExam = "select ExamPrice from exam where ExamID = ?";
                    PreparedStatement psB = conn.prepareStatement(queryExam);
                    psB.setInt(1, ItemID);
                    ResultSet rsB = psB.executeQuery();
                    while (rsB.next()) {
                        price = rsB.getInt("Price");
                    }
                    if (price == paymentvalues) {
                        String query9 = "update payment_item set PaidFor = ? where ItemID = ? ";
                        PreparedStatement ps9 = conn.prepareStatement(query9);
                        ps9.setString(1, "Yes");
                        ps9.setInt(2, ItemID);
                        ps9.executeUpdate();
                    }
                }
                JOptionPane.showMessageDialog(null, "Payment added successfully");
                //------------------------------------ End Of Queries
                if (InvoiceBox.isSelected() == true) {
                    System.out.println("Generating Invoice");
                } else if (InvoiceBox.isSelected() == false) {
                    System.out.println("Don't Generate Invoice");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddPaymentBtnActionPerformed

    public int getItemID(String item, int std) {
        int id = 0;
        try {
            if (item.equals("Book")) {
                String query1 = "select BookID from book where StdID = ?";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, std);
                ResultSet rs = ps.executeQuery();
                if (!rs.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "No data found");
                }
                while (rs.next()) {
                    id = rs.getInt("BookID");
                }
            } else if (item.equals("Course")) {
                String query1 = "select courseID from student_course where StdID = ?";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, std);
                ResultSet rs = ps.executeQuery();
                if (!rs.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "No data found");
                }
                while (rs.next()) {
                    id = rs.getInt("courseID");
                }
            } else if (item.equals("Exam")) {
                String query1 = "select examID from student_exam where StdID = ?";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, std);
                ResultSet rs = ps.executeQuery();
                if (!rs.isBeforeFirst()) {
                    JOptionPane.showMessageDialog(null, "No data found");
                }
                while (rs.next()) {
                    id = rs.getInt("examID");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    private void ShowPaymentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPaymentsBtnActionPerformed
        paymentTableJFrame pt = new paymentTableJFrame();
        pt.setVisible(true);
    }//GEN-LAST:event_ShowPaymentsBtnActionPerformed

    private void InvoiceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceBoxActionPerformed

    private void BookRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookRadioBtnActionPerformed

    }//GEN-LAST:event_BookRadioBtnActionPerformed
    public void AddToBookComboBox() {
        try {
            if (IDField.getText().isEmpty()) {
                System.out.println("ID Field is Empty");
            } else if (!IDField.getText().isEmpty()) {
                int ID = Integer.parseInt(IDField.getText());
                String query1 = "select BookName from book,student_book where book.BookId = student_book.BookID and StdID = ? and book.BookId = (select ItemID from payment_item where PaidFor = 'No')";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, ID);
                ResultSet rs = ps.executeQuery();
                if (!rs.isBeforeFirst()) {
                    BookPanel.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No data found");
                }
                while (rs.next()) {
                    BookComboBox.addItem(rs.getString("BookName"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddToCourseComboBox() {
        try {
            if (IDField.getText().isEmpty()) {
                System.out.println("ID Field is Empty");
            } else if (!IDField.getText().isEmpty()) {
                int ID = Integer.parseInt(IDField.getText());
                String query1 = "select CourseName from course,student_course where course.CourseId = student_course.courseID and StdID = ? and course.CourseId = (select ItemID from payment_item where PaidFor = 'No')";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, ID);
                ResultSet rs = ps.executeQuery();
                if (!rs.isBeforeFirst()) {
                    CoursePanel.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No data found");
                }
                while (rs.next()) {
                    courseComboBox.addItem(rs.getString("CourseName"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddToExamComboBox() {
        try {
            if (IDField.getText().isEmpty()) {
                System.out.println("ID Field is Empty");
            } else if (!IDField.getText().isEmpty()) {
                int ID = Integer.parseInt(IDField.getText());
                String query1 = "select ExamName from exam,student_exam where exam.ExamID = student_exam.examID and StdID = ? and exam.ExamID = (select ItemID from payment_item where PaidFor = 'No')";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, ID);
                ResultSet rs = ps.executeQuery();
                if (!rs.isBeforeFirst()) {
                    ExamPanel.setVisible(false);
                    JOptionPane.showMessageDialog(null, "No data found");
                }
                while (rs.next()) {
                    examComboBox.addItem(rs.getString("ExamName"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void BookRadioBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BookRadioBtnStateChanged
//        if (BookRadioBtn.isSelected() == true) {
//            BookPanel.setVisible(true);
//            AddToBookComboBox();
//        } else if (BookRadioBtn.isSelected() == false) {
//            BookPanel.setVisible(false);
//            BookComboBox.removeAllItems();
//        }
    }//GEN-LAST:event_BookRadioBtnStateChanged

    private void CourseRadioBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CourseRadioBtnItemStateChanged
        if (CourseRadioBtn.isSelected() == true) {
            CoursePanel.setVisible(true);
            AddToCourseComboBox();
        } else if (CourseRadioBtn.isSelected() == false) {
            CoursePanel.setVisible(false);
            courseComboBox.removeAllItems();
        }
    }//GEN-LAST:event_CourseRadioBtnItemStateChanged

    private void CourseRadioBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CourseRadioBtnStateChanged
//        if (CourseRadioBtn.isSelected() == true) {
//            CoursePanel.setVisible(true);
//            AddToCourseComboBox();
//        } else if (CourseRadioBtn.isSelected() == false) {
//            CoursePanel.setVisible(false);
//            courseComboBox.removeAllItems();
//        }
    }//GEN-LAST:event_CourseRadioBtnStateChanged

    private void ExamRadioBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ExamRadioBtnStateChanged
//        if (ExamRadioBtn.isSelected() == true) {
//            ExamPanel.setVisible(true);
//            AddToExamComboBox();
//        } else if (ExamRadioBtn.isSelected() == false) {
//            ExamPanel.setVisible(false);
//            examComboBox.removeAllItems();
//        }
    }//GEN-LAST:event_ExamRadioBtnStateChanged

    private void BookRadioBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BookRadioBtnItemStateChanged
        if (BookRadioBtn.isSelected() == true) {
            BookPanel.setVisible(true);
            AddToBookComboBox();
        } else if (BookRadioBtn.isSelected() == false) {
            BookPanel.setVisible(false);
            BookComboBox.removeAllItems();
        }
    }//GEN-LAST:event_BookRadioBtnItemStateChanged

    private void ExamRadioBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ExamRadioBtnItemStateChanged
        if (ExamRadioBtn.isSelected() == true) {
            ExamPanel.setVisible(true);
            AddToExamComboBox();
        } else if (ExamRadioBtn.isSelected() == false) {
            ExamPanel.setVisible(false);
            examComboBox.removeAllItems();
        }
    }//GEN-LAST:event_ExamRadioBtnItemStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPaymentBtn;
    private javax.swing.JComboBox<String> BookComboBox;
    private javax.swing.JPanel BookPanel;
    private javax.swing.JRadioButton BookRadioBtn;
    private javax.swing.JPanel CoursePanel;
    private javax.swing.JRadioButton CourseRadioBtn;
    private javax.swing.JPanel ExamPanel;
    private javax.swing.JRadioButton ExamRadioBtn;
    private javax.swing.JTextField IDField;
    private javax.swing.JCheckBox InvoiceBox;
    private javax.swing.JComboBox<String> PaymentTypeComboBox;
    private javax.swing.JLabel ShowLabel;
    private javax.swing.JButton ShowPaymentsBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JComboBox<String> examComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField paymentValue;
    // End of variables declaration//GEN-END:variables
}
