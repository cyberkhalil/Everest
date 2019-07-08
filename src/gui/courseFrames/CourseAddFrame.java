package gui.courseFrames;

import static courses.CourseUtil.createCourse;
import static courses.CourseUtil.createCourser;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import teachers.Teacher;
import static teachers.TeacherUtil.getTeachersIdAndName;
import static utils.ExceptionUtil.printEx;
import static utils.Strings.EVEREST_TITLE;
import static utils.Strings.SQL_EXCEPTION_MSG;
import static utils.TimeUtil.isValidDateOrder;
import static utils.gui.GUI_Util.buildComboBoxModel;
import static utils.gui.GUI_Util.promoteSpinner;

public class CourseAddFrame extends javax.swing.JFrame {

    public CourseAddFrame() {
        initComponents();
        try {
            courseTeacherCb.setModel(buildComboBoxModel(getTeachersIdAndName()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
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
        addCourseBtn = new javax.swing.JButton();
        courseNameLbl = new javax.swing.JLabel();
        coursePriceLbl = new javax.swing.JLabel();
        courseNameTf = new javax.swing.JTextField();
        cousrePriceSp = new javax.swing.JSpinner();
        daysLbl = new javax.swing.JLabel();
        courseStartDateDP = new org.jdesktop.swingx.JXDatePicker();
        startDateLbl = new javax.swing.JLabel();
        endDateLbl = new javax.swing.JLabel();
        courseEndDateDP = new org.jdesktop.swingx.JXDatePicker();
        courseStartTimeFtf = new javax.swing.JFormattedTextField();
        startTimeLbl = new javax.swing.JLabel();
        endTimeLbl = new javax.swing.JLabel();
        courseEndTimeFtf = new javax.swing.JFormattedTextField();
        daysPnl = new javax.swing.JPanel();
        daysCB1 = new javax.swing.JCheckBox();
        daysCB2 = new javax.swing.JCheckBox();
        daysCB3 = new javax.swing.JCheckBox();
        daysCB4 = new javax.swing.JCheckBox();
        daysCB5 = new javax.swing.JCheckBox();
        daysCB6 = new javax.swing.JCheckBox();
        daysCB7 = new javax.swing.JCheckBox();
        courseTeacherTb = new javax.swing.JToggleButton();
        courseTeacherCb = new javax.swing.JComboBox<>();
        daysLbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);
        setName("frame"); // NOI18N
        setResizable(false);
        setSize(this.contentPnl.getSize()
        );

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        titlePnl.setPreferredSize(new java.awt.Dimension(300, 102));

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        titleLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText(EVEREST_TITLE);

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

        contentTitleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contentTitleLbl.setForeground(new java.awt.Color(0, 51, 153));
        contentTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentTitleLbl.setText("Add a new course");

        addCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addCourseBtn.setForeground(new java.awt.Color(0, 51, 153));
        addCourseBtn.setText("Add");
        addCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseBtnActionPerformed(evt);
            }
        });

        courseNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseNameLbl.setText("Course name:");

        coursePriceLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        coursePriceLbl.setForeground(new java.awt.Color(0, 51, 153));
        coursePriceLbl.setText("Price:");

        cousrePriceSp.setModel(new SpinnerNumberModel(0,0,999.99,1));

        daysLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        daysLbl.setForeground(new java.awt.Color(0, 51, 153));
        daysLbl.setText("Days:");

        startDateLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        startDateLbl.setForeground(new java.awt.Color(0, 51, 153));
        startDateLbl.setText("Start Date:");

        endDateLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        endDateLbl.setForeground(new java.awt.Color(0, 51, 153));
        endDateLbl.setText("End Date:");

        courseEndDateDP.setDate(new java.util.Date(System.currentTimeMillis()+2_592_000_000l));

        try {
            courseStartTimeFtf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        courseStartTimeFtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        startTimeLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        startTimeLbl.setForeground(new java.awt.Color(0, 51, 153));
        startTimeLbl.setText("Start Time:");

        endTimeLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        endTimeLbl.setForeground(new java.awt.Color(0, 51, 153));
        endTimeLbl.setText("End Time:");

        try {
            courseEndTimeFtf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        courseEndTimeFtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        daysCB1.setBackground(getBackground());
        daysCB1.setText("Saturday");

        daysCB2.setBackground(getBackground());
        daysCB2.setText("Sunday");

        daysCB3.setBackground(getBackground());
        daysCB3.setText("Monday");

        daysCB4.setBackground(getBackground());
        daysCB4.setText("Tuesday");

        daysCB5.setBackground(getBackground());
        daysCB5.setText("Wednesday");

        daysCB6.setBackground(getBackground());
        daysCB6.setText("Thursday");

        daysCB7.setBackground(getBackground());
        daysCB7.setText("Friday");

        javax.swing.GroupLayout daysPnlLayout = new javax.swing.GroupLayout(daysPnl);
        daysPnl.setLayout(daysPnlLayout);
        daysPnlLayout.setHorizontalGroup(
            daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daysPnlLayout.createSequentialGroup()
                .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(daysPnlLayout.createSequentialGroup()
                        .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daysCB2)
                            .addComponent(daysCB1)
                            .addComponent(daysCB3))
                        .addGap(22, 22, 22)
                        .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(daysCB6)
                            .addComponent(daysCB4)
                            .addComponent(daysCB5)))
                    .addGroup(daysPnlLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(daysCB7)))
                .addGap(0, 0, 0))
        );
        daysPnlLayout.setVerticalGroup(
            daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daysPnlLayout.createSequentialGroup()
                .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysCB1)
                    .addComponent(daysCB4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysCB2)
                    .addComponent(daysCB5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daysPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(daysCB3)
                    .addComponent(daysCB6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daysCB7)
                .addGap(0, 0, 0))
        );

        courseTeacherTb.setText("OFF");
        courseTeacherTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseTeacherTbActionPerformed(evt);
            }
        });

        courseTeacherCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        daysLbl1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        daysLbl1.setForeground(new java.awt.Color(0, 51, 153));
        daysLbl1.setText("Teacher");

        javax.swing.GroupLayout contentPnlLayout = new javax.swing.GroupLayout(contentPnl);
        contentPnl.setLayout(contentPnlLayout);
        contentPnlLayout.setHorizontalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endDateLbl)
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseNameLbl)
                            .addComponent(coursePriceLbl)
                            .addComponent(startDateLbl)
                            .addComponent(endTimeLbl)
                            .addComponent(startTimeLbl)
                            .addComponent(daysLbl))
                        .addGap(33, 33, 33)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(courseEndTimeFtf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(courseStartTimeFtf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(courseStartDateDP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cousrePriceSp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(courseEndDateDP, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                            .addComponent(daysPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPnlLayout.createSequentialGroup()
                                .addComponent(courseTeacherCb, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(courseTeacherTb))
                            .addComponent(addCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(daysLbl1)))
        );
        contentPnlLayout.setVerticalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentTitleLbl)
                .addGap(18, 18, 18)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursePriceLbl)
                    .addComponent(cousrePriceSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(courseStartDateDP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDateLbl)
                    .addComponent(courseEndDateDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseStartTimeFtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTimeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endTimeLbl)
                    .addComponent(courseEndTimeFtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(daysLbl))
                    .addComponent(daysPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseTeacherCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseTeacherTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysLbl1))
                .addGap(11, 11, 11)
                .addComponent(addCourseBtn)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
            .addComponent(contentPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseBtnActionPerformed
        if (courseNameTf.getText() == null || courseNameTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Course MUST have course name");
            return;
        }
        if (!isValidDateOrder(courseStartDateDP.getDate(), courseEndDateDP.getDate())) {
            JOptionPane.showMessageDialog(rootPane,
                    "Course start time MUST be after course end time");
            return;
        }

        try {
            if (courseTeacherTb.isSelected()) {
                String teacher_item = courseTeacherCb.getSelectedItem().toString();
                String teacher_id = teacher_item.substring(1, teacher_item.indexOf(")"));
                promoteSpinner("Add teacher to course", "Static teacher money",
                        new SpinnerNumberModel(0, 0, 100, 1), "Add to course", (value) -> {
                            try {
                                new Teacher(Integer.parseInt(teacher_id)).enrollToCourse(
                                        createCourser(courseNameTf.getText(),
                                                new Date(courseStartDateDP.getDateInMillis()),
                                                new Date(courseEndDateDP.getDateInMillis()),
                                                (double) cousrePriceSp.getValue(),
                                                courseEndTimeFtf.getText(),
                                                courseStartTimeFtf.getText(),
                                                getDays()
                                        ).getId(), true, value);
                                return true;
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                                printEx(ex);
                            }
                            return false;
                        });
                JOptionPane.showMessageDialog(this, "New Course created successfully");
            } else {
                createCourse(courseNameTf.getText(),
                        new Date(courseStartDateDP.getDateInMillis()),
                        new Date(courseEndDateDP.getDateInMillis()),
                        (double) cousrePriceSp.getValue(),
                        courseEndTimeFtf.getText(),
                        courseStartTimeFtf.getText(),
                        getDays());
                JOptionPane.showMessageDialog(this, "New Course created successfully");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_addCourseBtnActionPerformed

    private void courseTeacherTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseTeacherTbActionPerformed
        courseTeacherTb.setText(courseTeacherTb.isSelected() ? "ON" : "OFF");
    }//GEN-LAST:event_courseTeacherTbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseBtn;
    private javax.swing.JPanel contentPnl;
    private javax.swing.JLabel contentTitleLbl;
    private org.jdesktop.swingx.JXDatePicker courseEndDateDP;
    private javax.swing.JFormattedTextField courseEndTimeFtf;
    private javax.swing.JLabel courseNameLbl;
    private javax.swing.JTextField courseNameTf;
    private javax.swing.JLabel coursePriceLbl;
    private org.jdesktop.swingx.JXDatePicker courseStartDateDP;
    private javax.swing.JFormattedTextField courseStartTimeFtf;
    private javax.swing.JComboBox<String> courseTeacherCb;
    private javax.swing.JToggleButton courseTeacherTb;
    private javax.swing.JSpinner cousrePriceSp;
    private javax.swing.JCheckBox daysCB1;
    private javax.swing.JCheckBox daysCB2;
    private javax.swing.JCheckBox daysCB3;
    private javax.swing.JCheckBox daysCB4;
    private javax.swing.JCheckBox daysCB5;
    private javax.swing.JCheckBox daysCB6;
    private javax.swing.JCheckBox daysCB7;
    private javax.swing.JLabel daysLbl;
    private javax.swing.JLabel daysLbl1;
    private javax.swing.JPanel daysPnl;
    private javax.swing.JLabel endDateLbl;
    private javax.swing.JLabel endTimeLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel startDateLbl;
    private javax.swing.JLabel startTimeLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private String getDays() {
        String days = "";
        if (daysCB1.isSelected()) {
            days += "Sa,";
        }
        if (daysCB2.isSelected()) {
            days += "Su,";
        }
        if (daysCB3.isSelected()) {
            days += "Mo,";
        }
        if (daysCB4.isSelected()) {
            days += "Tu,";
        }
        if (daysCB5.isSelected()) {
            days += "We,";
        }
        if (daysCB6.isSelected()) {
            days += "Th,";
        }
        if (daysCB7.isSelected()) {
            days += days.length() < 18 ? "Fr," : "Fr";
        }
        while (days.length() != 20) {
            days += days.length() < 18 ? "  ," : "  ";
        }
        return days;
    }
}
