
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StudentJFrame extends javax.swing.JFrame {

    static double totalprice = 0;
    static double net = 0;
    static double remained = 0;
    double Bookprice = 0;
    int bookID = 0;
    double Courseprice = 0;
    double ExamCost = 0;
    int ExamID = 0;
    Student student = new Student();
    Book b = new Book();
    UserEntry UserEntry = new UserEntry();
    Course c = new Course();

    public StudentJFrame() {
        initComponents();
        addBook();
        addCourse();
        addExam();
        //InvoiceBtn.setEnabled(false);
        BookBox.setEnabled(false);
        courseName.setEnabled(false);
        ExamBox.setEnabled(false);
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        AddStdBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        paymentValue = new javax.swing.JTextField();
        StudentName = new javax.swing.JTextField();
        BookCheckBox = new javax.swing.JCheckBox();
        BookBox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        courseName = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        paymentMethod = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        StudentPhoneNum1 = new javax.swing.JTextField();
        CourseCheckBox = new javax.swing.JCheckBox();
        ExamCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        BookIDField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DiscountField = new javax.swing.JTextField();
        ExamBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        GenInvoiceBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(428, 511));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Everest Training center");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Add new student");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 171, 112)));

        AddStdBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddStdBtn.setForeground(new java.awt.Color(0, 51, 153));
        AddStdBtn.setText("Add");
        AddStdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStdBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));
        jLabel14.setText("student name:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("student phone number:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 153));
        jLabel16.setText("Do you want to buy a book ?");

        paymentValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentValueActionPerformed(evt);
            }
        });

        StudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNameActionPerformed(evt);
            }
        });

        BookCheckBox.setText("Yes");
        BookCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BookCheckBoxStateChanged(evt);
            }
        });
        BookCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookCheckBoxActionPerformed(evt);
            }
        });

        BookBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBoxActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 153));
        jLabel17.setText("payment method :");

        courseName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                courseNameItemStateChanged(evt);
            }
        });
        courseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseNameActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 153));
        jLabel18.setText("Choose the wanted Course:");

        paymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Check", "Payments" }));
        paymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentMethodActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("payment value :");

        StudentPhoneNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentPhoneNum1ActionPerformed(evt);
            }
        });

        CourseCheckBox.setText("select");
        CourseCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseCheckBoxActionPerformed(evt);
            }
        });

        ExamCheckBox.setText("Want to take an Exam ");
        ExamCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ExamCheckBoxStateChanged(evt);
            }
        });
        ExamCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamCheckBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Book ID:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Student ID number: ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Discount :");

        DiscountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountFieldActionPerformed(evt);
            }
        });

        ExamBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ExamBoxItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Select Exam Name:");

        GenInvoiceBox.setText("Generate an Invoice");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExamCheckBox)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(paymentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DiscountField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(paymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(BookBox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(BookIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AddStdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(StudentPhoneNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CourseCheckBox))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BookCheckBox))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExamBox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GenInvoiceBox)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StudentPhoneNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(StudentName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(CourseCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(BookCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(BookIDField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExamCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExamBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiscountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentValue)
                    .addComponent(paymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(GenInvoiceBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddStdBtn)
                .addGap(296, 296, 296))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStdBtnActionPerformed
        try {
            Connection conn = DBConnection.getConnection();
            double discountValue = Double.parseDouble(DiscountField.getText());
            String studentName = StudentName.getText();
            int student_phone_num = Integer.parseInt(StudentPhoneNum1.getText());
            String payMethod = this.paymentMethod.getSelectedItem().toString();
            double payValue = Double.parseDouble(this.paymentValue.getText());
            int ID = Integer.parseInt(IDField.getText());
            //----------------------------------
            student.setName(studentName);
            student.setPhoneNumber(student_phone_num);
            student.setPaymentMethod(payMethod);
            student.setPaid(payValue);
            student.setDiscount(discountValue);
            totalprice = Bookprice + Courseprice + ExamCost;
            student.setTotalPrice(totalprice);
            net = totalprice - discountValue;
            student.setNet(net);
            UserEntry.createStudent(student, student.getName(), ID, student.getPhoneNumber(), student.getPaymentMethod(), student.getPaid(), student.getTotalPrice(), student.getDiscount(), student.getNet());
            //System.out.println(student.getName());++
            String query3 = "select max(StdId) as stdid from student";
            PreparedStatement preparedStmt3 = conn.prepareStatement(query3);
            //preparedStmt3.setString(1, student.getName());
            ResultSet rsss = preparedStmt3.executeQuery();
            int stdid = 0;
            while (rsss.next()) {
                stdid = rsss.getInt("stdid");
                student.setStdID(stdid);
            }
            if (BookCheckBox.isSelected()) {
                String name = "Book";
                int BookID = Integer.parseInt(BookIDField.getText());
                String query4 = "UPDATE book SET student_id_fk =? WHERE BookId =?";
                PreparedStatement preparedStmt4 = conn.prepareStatement(query4);
                preparedStmt4.setInt(1, stdid);
                preparedStmt4.setInt(2, BookID);
                preparedStmt4.executeUpdate();
                this.getItemName(name, BookID);
                UserEntry.getMaxPaymentID();
                int id = UserEntry.getItemID(name, stdid);
                UserEntry.addItem(name, id);
            }
            if (ExamCheckBox.isSelected()) {
                String name = "Exam";
                this.ExamCheckBoxActionPerformed(null);
                ExamID = this.getExamID(ExamBox.getSelectedItem().toString());
                String query = " insert into student_exam (Std_ID,Exam_ID) values (?,?)";
                // create the mysql insert preparedstatement
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt(1, stdid);
                preparedStmt.setInt(2, ExamID);
                // execute the preparedstatement
                preparedStmt.execute();
                this.getItemName(name, ExamID);
                UserEntry.getMaxPaymentID();
                int id = UserEntry.getItemID(name, stdid);
                UserEntry.addItem(name, id);
            }
            if (CourseCheckBox.isSelected()) {
                String name = "Course";
                String query2 = "select CourseId from course where CourseName =?";
                PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
                preparedStmt2.setString(1, courseName.getSelectedItem().toString());
                ResultSet rss = preparedStmt2.executeQuery();
                int courseid = 0;
                while (rss.next()) {
                    courseid = rss.getInt("CourseId");
                    c.setCourseId(courseid);
                }
                String query = " insert into student_course (student_id_fk,course_id_fk) values (?,?)";
                // create the mysql insert preparedstatement
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt(1, stdid);
                preparedStmt.setInt(2, courseid);
                // execute the preparedstatement
                preparedStmt.execute();
                this.getItemName(name, courseid);
                UserEntry.getMaxPaymentID();
                int id = UserEntry.getItemID(name, stdid);
                UserEntry.addItem(name, id);
            }
            if (this.GenInvoiceBox.isSelected()) {
                JOptionPane.showMessageDialog(null, "new student has been added sucessfully, Press Ok to generate Invoice");
                InvoiceToPdf.invoicetopdf();
            } else if (this.GenInvoiceBox.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "new student has been added sucessfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception: " + e);
        }
    }//GEN-LAST:event_AddStdBtnActionPerformed
    public void addBook() {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "select BookName from book where student_id_fk IS NULL";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            int i = 0;
            while (rs.next()) {
                String book_name = rs.getString("BookName");
                BookBox.addItem(book_name);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public String getItemName(String item, int id) {
        String name = "";
        Connection conn = DBConnection.getConnection();
        try {
            if (item.equals("Book")) {
                String query1 = "select BookName from book where BookId = ?";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "No data found");
                }
                while (rs.next()) {
                    name = rs.getString("BookName");
                }
            } else if (item.equals("Course")) {
                String query1 = "select CourseName from course where CourseId = ?";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "No data found");
                }
                while (rs.next()) {
                    name = rs.getString("CourseName");
                }
            } else if (item.equals("Exam")) {
                String query1 = "select ExamName from exam where ExamID = ?";
                PreparedStatement ps = conn.prepareStatement(query1);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "No data found");
                }
                while (rs.next()) {
                    name = rs.getString("ExamName");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }

    public void addCourse() {
        try {
            Connection conn = DBConnection.getConnection();
            String query1 = "select CourseName from course";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStatement1 = conn.prepareStatement(query1);
            ResultSet rs1 = preparedStatement1.executeQuery();

            while (rs1.next()) {
                String course_name = rs1.getString("courseName");
                courseName.addItem(course_name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void addExam() {
        try {
            Connection conn = DBConnection.getConnection();
            String query1 = "select ExamName from exam";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStatement1 = conn.prepareStatement(query1);
            ResultSet rs1 = preparedStatement1.executeQuery();
//            int i = 0;
            while (rs1.next()) {
                String Exam_name = rs1.getString("ExamName");
                ExamBox.addItem(Exam_name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void paymentValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentValueActionPerformed

    private void StudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNameActionPerformed

    private void BookCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookCheckBoxActionPerformed

    private void BookCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BookCheckBoxStateChanged
        if (BookCheckBox.isSelected()) {
            BookBox.setEnabled(true);
            this.BookBoxActionPerformed(null);
        } else {
            BookBox.setEnabled(false);
            BookIDField.setText("");
        }
    }//GEN-LAST:event_BookCheckBoxStateChanged

    private void courseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseNameActionPerformed

    private void paymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentMethodActionPerformed

    private void StudentPhoneNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentPhoneNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentPhoneNum1ActionPerformed

    private void CourseCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseCheckBoxActionPerformed
        if (CourseCheckBox.isSelected()) {
            courseName.setEnabled(true);
            try {
                Connection conn = DBConnection.getConnection();
                String Coursename = courseName.getSelectedItem().toString();
                String query = "select CoursePrice from course where CourseName =?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, Coursename);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Courseprice = rs.getDouble("CoursePrice");
                }
            } catch (SQLException ex) {
                Logger.getLogger(StudentJFrame.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            courseName.setEnabled(false);
            Courseprice = 0;
        }
    }//GEN-LAST:event_CourseCheckBoxActionPerformed
    private int getExamID(String ExamName) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "select ExamID from exam where ExamName =?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ExamName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ExamID = rs.getInt("ExamID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentJFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return ExamID;
    }
    private void ExamCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamCheckBoxActionPerformed
        if (ExamCheckBox.isSelected()) {
            ExamBox.setEnabled(true);
            try {
                Connection conn = DBConnection.getConnection();
                String ExamName = ExamBox.getSelectedItem().toString();
                String query = "select ExamPrice,ExamID from exam where ExamName =?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, ExamName);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    ExamCost = rs.getDouble("ExamPrice");
                    ExamID = rs.getInt("ExamID");
                }
                System.out.println(ExamCost + " " + ExamID);
            } catch (SQLException ex) {
                Logger.getLogger(StudentJFrame.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            ExamBox.setEnabled(false);
            ExamCost = 0;
            //ExamID = 0;
        }
    }//GEN-LAST:event_ExamCheckBoxActionPerformed

    private void DiscountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscountFieldActionPerformed

    private void BookBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBoxActionPerformed
        if (BookCheckBox.isSelected()) {
            try {
                Connection conn = DBConnection.getConnection();
                String bookname = BookBox.getSelectedItem().toString();
                String query = "select Price,BookId from book where BookName =?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, bookname);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Bookprice = rs.getDouble("Price");
                    bookID = rs.getInt("BookId");
                }
                BookIDField.setText("" + bookID);
            } catch (SQLException ex) {
                Logger.getLogger(StudentJFrame.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            BookBox.setEnabled(false);
            Bookprice = 0;
        }
    }//GEN-LAST:event_BookBoxActionPerformed

    private void ExamCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ExamCheckBoxStateChanged

    }//GEN-LAST:event_ExamCheckBoxStateChanged

    private void ExamBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ExamBoxItemStateChanged
        if (ExamCheckBox.isSelected()) {
            ExamBox.setEnabled(true);
            this.ExamCheckBoxActionPerformed(null);
        } else {
            ExamBox.setEnabled(false);
        }
    }//GEN-LAST:event_ExamBoxItemStateChanged

    private void courseNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_courseNameItemStateChanged
        if (CourseCheckBox.isSelected()) {
            courseName.setEnabled(true);
            this.CourseCheckBoxActionPerformed(null);
        } else {
            courseName.setEnabled(false);
        }
    }//GEN-LAST:event_courseNameItemStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStdBtn;
    private javax.swing.JComboBox<String> BookBox;
    private javax.swing.JCheckBox BookCheckBox;
    private javax.swing.JTextField BookIDField;
    private javax.swing.JCheckBox CourseCheckBox;
    private javax.swing.JTextField DiscountField;
    private javax.swing.JComboBox<String> ExamBox;
    private javax.swing.JCheckBox ExamCheckBox;
    private javax.swing.JCheckBox GenInvoiceBox;
    private javax.swing.JTextField IDField;
    private javax.swing.JTextField StudentName;
    private javax.swing.JTextField StudentPhoneNum1;
    private javax.swing.JComboBox<String> courseName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> paymentMethod;
    private javax.swing.JTextField paymentValue;
    // End of variables declaration//GEN-END:variables
}
