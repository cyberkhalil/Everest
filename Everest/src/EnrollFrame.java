
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EnrollFrame extends javax.swing.JFrame {
    double ExamPrice = 0;
    int ExamID = 0;
    double CoursePrice = 0;
    int CourseId = 0;
    int courseSwitch = 0;
    int examSwitch = 0;
    ArrayList<Integer> ids = new ArrayList<>();
    ArrayList<String> CourseNames = new ArrayList<>();
    ArrayList<String> ExamNames = new ArrayList<>();
    String course[] = new String[this.getCourseCount()];
    String exam[] = new String[this.getExamCount()];

    public EnrollFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        CoursePanel.setVisible(false);
        ExamPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CommitBtn = new javax.swing.JButton();
        StdIDComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        IDField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CoursePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CourseComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CourseLabel = new javax.swing.JLabel();
        ExamPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ExamComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ExamLabel = new javax.swing.JLabel();
        CourseBtn = new javax.swing.JButton();
        ExamBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        CommitBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CommitBtn.setForeground(new java.awt.Color(0, 51, 153));
        CommitBtn.setText("add");
        CommitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommitBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Select Student serial number:");

        SearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(0, 51, 153));
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Enter Student ID number:");

        CoursePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("select course name: ");

        CourseComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CourseComboBoxItemStateChanged(evt);
            }
        });
        CourseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Course ID is : ");

        CourseLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CourseLabel.setForeground(new java.awt.Color(0, 51, 153));
        CourseLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        javax.swing.GroupLayout CoursePanelLayout = new javax.swing.GroupLayout(CoursePanel);
        CoursePanel.setLayout(CoursePanelLayout);
        CoursePanelLayout.setHorizontalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(CourseComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        CoursePanelLayout.setVerticalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        ExamPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("select exam name:");

        ExamComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ExamComboBoxItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Exam ID is :");

        ExamLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ExamLabel.setForeground(new java.awt.Color(0, 51, 153));
        ExamLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        javax.swing.GroupLayout ExamPanelLayout = new javax.swing.GroupLayout(ExamPanel);
        ExamPanel.setLayout(ExamPanelLayout);
        ExamPanelLayout.setHorizontalGroup(
            ExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExamPanelLayout.createSequentialGroup()
                        .addGroup(ExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(ExamComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ExamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ExamPanelLayout.setVerticalGroup(
            ExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        CourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CourseBtn.setForeground(new java.awt.Color(0, 51, 153));
        CourseBtn.setText("Enroll to a course");
        CourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseBtnActionPerformed(evt);
            }
        });

        ExamBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ExamBtn.setForeground(new java.awt.Color(0, 51, 153));
        ExamBtn.setText("Enroll to an exam");
        ExamBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ExamBtnStateChanged(evt);
            }
        });
        ExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                                .addComponent(SearchBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CoursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(CourseBtn)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ExamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(ExamBtn)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StdIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(CommitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(StdIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseBtn)
                    .addComponent(ExamBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CoursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(CommitBtn))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void getID(int IDNum) {
        try {
            Connection conn = login.getConnection();
            int StdID = 0;
            String query1 = "select StdID from student where IDCardNum = ?";
            PreparedStatement ps = conn.prepareStatement(query1);
            ps.setInt(1, IDNum);
            ResultSet rs = ps.executeQuery();
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No data found");
            }
            while (rs.next()) {
                StdID = rs.getInt("StdID");
                System.out.println(StdID);
                ids.add(StdID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getCourseCount() {
        int courseNum = 0;
        try {
            Connection conn = login.getConnection();
            String query1 = "select count(CourseName) as courseNum from course";
            PreparedStatement ps = conn.prepareStatement(query1);
            ResultSet rs = ps.executeQuery();
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No data found");
            }
            while (rs.next()) {
                courseNum = rs.getInt("courseNum");
                System.out.println(courseNum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courseNum;
    }

    public int getExamCount() {
        int examNum = 0;
        try {
            Connection conn = login.getConnection();
            String query1 = "select count(ExamName) as examNum from exam";
            PreparedStatement ps = conn.prepareStatement(query1);
            ResultSet rs = ps.executeQuery();
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No data found");
            }
            while (rs.next()) {
                examNum = rs.getInt("examNum");
                System.out.println(examNum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return examNum;
    }

    public void getCourseName() {
        try {
            int i = 0;
            String CourseName = "";
            Connection conn = login.getConnection();
            String query1 = "select CourseName from course";
            PreparedStatement ps = conn.prepareStatement(query1);
            ResultSet rs = ps.executeQuery();
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No data found");
            }
            while (rs.next()) {
                CourseName = rs.getString("CourseName");
                System.out.println(CourseName);
                course[i] = CourseName;
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getExamName() {
        try {
            String ExamName = "";
            Connection conn = login.getConnection();
            String query1 = "select ExamName from exam";
            PreparedStatement ps = conn.prepareStatement(query1);
            ResultSet rs = ps.executeQuery();
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No data found");
            }
            while (rs.next()) {
                ExamName = rs.getString("ExamName");
                System.out.println(ExamName);
                ExamComboBox.addItem(ExamName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void UpdateCourse() {
        try {
            if (CourseComboBox.getItemCount() >= 1) {
                for (int i = CourseComboBox.getItemCount() - 1; i >= 0; i--) {
                    CourseComboBox.removeItemAt(i);
                }
            } else if (CourseComboBox.getItemCount() < 1) {
                double CoursePrice = 0;
                int CourseId = 0;
                Connection conn = login.getConnection();
                String bookname = CourseComboBox.getSelectedItem().toString();
                String query = "select CoursePrice,CourseId from course where CourseName = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, bookname);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    CoursePrice = rs.getDouble("CoursePrice");
                    CourseId = rs.getInt("CourseId");
                }
                CourseLabel.setText("" + CourseId);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentJFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void UpdateExam() {
        try {
            if (ExamComboBox.getItemCount() >= 1) {
                for (int i = ExamComboBox.getItemCount() - 1; i >= 0; i--) {
                    ExamComboBox.removeItemAt(i);
                }
            } else if (CourseComboBox.getItemCount() < 1) {

                Connection conn = login.getConnection();
                String bookname = ExamComboBox.getSelectedItem().toString();
                String query = "select ExamPrice,ExamID from exam where ExamName =?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, bookname);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    ExamPrice = rs.getDouble("ExamPrice");
                    ExamID = rs.getInt("ExamID");
                }
                ExamLabel.setText("" + ExamID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentJFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addToCourseBox() {
        if (CourseComboBox.getItemCount() >= 1) {
            for (int i = CourseComboBox.getItemCount() - 1; i >= 0; i--) {
                CourseComboBox.removeItemAt(i);
            }
        }
        for (int i = 0; i <= CourseNames.size() - 1; i++) {
            String Coursename = CourseNames.get(i) + "";
            CourseComboBox.addItem(Coursename);
        }
    }

    public void addToExamBox() {
        if (ExamComboBox.getItemCount() >= 1) {
            for (int i = ExamComboBox.getItemCount() - 1; i >= 0; i--) {
                ExamComboBox.removeItemAt(i);
            }
        }
        for (int i = 0; i <= ExamNames.size() - 1; i++) {
            String Coursename = ExamNames.get(i) + "";
            ExamComboBox.addItem(Coursename);
        }
    }


    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        int ID = Integer.parseInt(IDField.getText());
        ids.clear();
        this.getID(ID);
        int itemCount = StdIDComboBox.getItemCount();
        for (int i = itemCount - 1; i >= 0; i--) {
            StdIDComboBox.removeItemAt(i);
        }
        for (int i = 0; i <= ids.size() - 1; i++) {
            String id = ids.get(i) + "";

            StdIDComboBox.addItem(id);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void CommitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommitBtnActionPerformed
        try {
            Connection conn = login.getConnection();
            if (courseSwitch == 1) {
                int stdid = Integer.parseInt(StdIDComboBox.getSelectedItem().toString());
                int CourseID = Integer.parseInt(CourseLabel.getText());
                String query1 = "UPDATE student_course SET student_id_fk =? WHERE course_id_fk =?";
                PreparedStatement preparedStmt1 = conn.prepareStatement(query1);
                preparedStmt1.setInt(1, stdid);
                preparedStmt1.setInt(2, CourseID);
                preparedStmt1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student has been enrolled successfully");
            } else if (examSwitch == 1) {
                int stdid = Integer.parseInt(StdIDComboBox.getSelectedItem().toString());
                int ExamID = Integer.parseInt(ExamLabel.getText());
                String query2 = "UPDATE student_exam SET Std_ID =? WHERE Exam_ID =?";
                PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
                preparedStmt2.setInt(1, stdid);
                preparedStmt2.setInt(2, ExamID);
                preparedStmt2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student has been enrolled successfully");
            } else if (courseSwitch == 1 && examSwitch == 1) {
                int stdid = Integer.parseInt(StdIDComboBox.getSelectedItem().toString());
                int CourseID = Integer.parseInt(CourseLabel.getText());
                int ExamID = Integer.parseInt(ExamLabel.getText());
                String query1 = "UPDATE student_course SET student_id_fk =? WHERE course_id_fk =?";
                PreparedStatement preparedStmt1 = conn.prepareStatement(query1);
                preparedStmt1.setInt(1, stdid);
                preparedStmt1.setInt(2, CourseID);
                preparedStmt1.executeUpdate();
                //-------------
                String query2 = "UPDATE student_exam SET Std_ID =? WHERE Exam_ID =?";
                PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
                preparedStmt2.setInt(1, stdid);
                preparedStmt2.setInt(2, ExamID);
                preparedStmt2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Student has been enrolled successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CommitBtnActionPerformed

    private void CourseComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CourseComboBoxItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                String CourseName;
                if (CourseComboBox.getSelectedItem() instanceof String) {
                    if (CourseComboBox.getItemCount() > 0) {
                        CourseName = CourseComboBox.getSelectedItem().toString();
                        if (courseSwitch == 1) {
                            if (CourseName != null) {
                                Connection conn = login.getConnection();
                                String query = "select CoursePrice,CourseId from course where CourseName = ?";
                                PreparedStatement ps = conn.prepareStatement(query);
                                ps.setString(1, CourseName);
                                ResultSet rs = ps.executeQuery();
                                if (!rs.isBeforeFirst()) {
                                    JOptionPane.showMessageDialog(null, "No data found");
                                }
                                while (rs.next()) {
                                    CoursePrice = rs.getDouble("CoursePrice");
                                    CourseId = rs.getInt("CourseId");
                                }
                                CourseLabel.setText("" + CourseId);
                            } else if (CourseName == null) {
                                System.out.println("can't select a course");
                            }
                        } else if (courseSwitch == 0) {
                            CourseName = null;
                        }
                    } else if (CourseComboBox.getItemCount() == 0) {
                        System.out.println("No Courses available");
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentJFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CourseComboBoxItemStateChanged

    private void ExamComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ExamComboBoxItemStateChanged
        try {
            if (evt.getStateChange() == ItemEvent.SELECTED) {
                String ExamName;
                if (ExamComboBox.getSelectedItem() instanceof String) {
                    if (ExamComboBox.getItemCount() > 0) {
                        ExamName = ExamComboBox.getSelectedItem().toString();
                        if (examSwitch == 1) {
                            if (ExamName != null) {
                                Connection conn = login.getConnection();
                                String query = "select ExamPrice,ExamID from exam where ExamName = ?";
                                PreparedStatement ps = conn.prepareStatement(query);
                                ps.setString(1, ExamName);
                                ResultSet rs = ps.executeQuery();
                                if (!rs.isBeforeFirst()) {
                                    JOptionPane.showMessageDialog(null, "No data found");
                                }
                                while (rs.next()) {
                                    ExamPrice = rs.getDouble("ExamPrice");
                                    ExamID = rs.getInt("ExamID");
                                }
                                ExamLabel.setText("" + ExamID);
                            } else if (ExamName == null) {
                                System.out.println("can't select an Exam");
                            }
                        } else if (courseSwitch == 0) {
                            ExamName = null;
                        }
                    } else if (ExamComboBox.getItemCount() == 0) {
                        System.out.println("No Exams available");
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentJFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExamComboBoxItemStateChanged

    private void ExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamBtnActionPerformed
        if (ExamPanel.isVisible() == false && examSwitch == 0) {
            this.getExamName();
            String name = null;
            for (int i = 0; i <= exam.length - 1; i++) {
                name = exam[i];
                System.out.println(name);
                ExamComboBox.addItem(name);
            }
            this.examSwitch = 1;
            System.out.println("Hello");

            ExamPanel.setVisible(true);
            ExamBtn.setText("Cancel");
        } else if (ExamPanel.isVisible() == true && examSwitch == 1) {
             ExamBtn.setText("Enroll to an exam");
            int itemCount = ExamComboBox.getItemCount();
            if (itemCount > 0) {
                for (int i = itemCount - 1; i >= 0; i--) {
                    ExamComboBox.removeItemAt(i);
                }
            }
            System.out.println("No Hello");
            ExamPanel.setVisible(false);
            this.examSwitch = 0;            
        }
    }//GEN-LAST:event_ExamBtnActionPerformed

    private void ExamBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ExamBtnStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ExamBtnStateChanged

    private void CourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseBtnActionPerformed
        if (CoursePanel.isVisible() == false && courseSwitch == 0) {
            this.getCourseName();
            String name = null;
            for (int i = 0; i <= course.length - 1; i++) {
                name = course[i];
                System.out.println(name);
                CourseComboBox.addItem(name);
            }
            this.courseSwitch = 1;
            System.out.println("Hello");
            // 
            CoursePanel.setVisible(true);
            CourseBtn.setText("Cancel");
        } else if (CoursePanel.isVisible() == true && courseSwitch == 1) {
            CourseBtn.setText("Enroll to a course");
            int itemCount = CourseComboBox.getItemCount();
            if (itemCount > 0) {
                for (int i = itemCount - 1; i >= 0; i--) {
                    CourseComboBox.removeItemAt(i);
                }
            }
            System.out.println("No Hello");
            CoursePanel.setVisible(false);
            this.courseSwitch = 0;
        }
    }//GEN-LAST:event_CourseBtnActionPerformed

    private void CourseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBoxActionPerformed

    }//GEN-LAST:event_CourseComboBoxActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnrollFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommitBtn;
    private javax.swing.JButton CourseBtn;
    private javax.swing.JComboBox<String> CourseComboBox;
    private javax.swing.JLabel CourseLabel;
    private javax.swing.JPanel CoursePanel;
    private javax.swing.JButton ExamBtn;
    private javax.swing.JComboBox<String> ExamComboBox;
    private javax.swing.JLabel ExamLabel;
    private javax.swing.JPanel ExamPanel;
    private javax.swing.JTextField IDField;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JComboBox<String> StdIDComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
