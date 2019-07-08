package gui.courseFrames;

import courses.Course;
import static courses.CourseUtil.getCoursesFormated;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableModel;
import static utils.ExceptionUtil.printEx;
import utils.Strings;
import static utils.Strings.EVEREST_TITLE;
import static utils.Strings.SQL_EXCEPTION_MSG;
import static utils.TimeUtil.isValidDateOrder;
import static utils.gui.GUI_Util.buildTableModel;
import static utils.gui.GUI_Util.link_2frames_to_button;
import static utils.gui.GUI_Util.link_frame_to_button;
import static utils.gui.GUI_Util.promoteDatePicker;
import static utils.gui.GUI_Util.promoteDays;
import static utils.gui.GUI_Util.promoteFormatedTextField;
import static utils.gui.GUI_Util.promoteSpinner;

public class CoursesEditFrame extends javax.swing.JFrame {

    private Course selectedCourse;

    public CoursesEditFrame() {
        initComponents();
        try {
            this.coursesTbl.setModel(buildTableModel(getCoursesFormated()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coursesSPnl = new javax.swing.JScrollPane();
        coursesTbl = new javax.swing.JTable();
        courseDataPnl = new javax.swing.JPanel();
        courseNameLbl = new javax.swing.JLabel();
        courseStartDateTf = new javax.swing.JTextField();
        courseIdTf = new javax.swing.JTextField();
        courseIdLbl = new javax.swing.JLabel();
        courseStartDateLbl = new javax.swing.JLabel();
        courseNameTf = new javax.swing.JTextField();
        coursePriceLbl = new javax.swing.JLabel();
        coursePriceTf = new javax.swing.JTextField();
        courseEndDateLbl = new javax.swing.JLabel();
        courseEndDateTf = new javax.swing.JTextField();
        courseTimeLbl = new javax.swing.JLabel();
        courseTimeTf = new javax.swing.JTextField();
        courseDaysLbl = new javax.swing.JLabel();
        courseDaysTf = new javax.swing.JTextField();
        courseButtonsPnl = new javax.swing.JPanel();
        setNameBtn = new javax.swing.JButton();
        setDateBtn = new javax.swing.JButton();
        deleteCourseBtn = new javax.swing.JButton();
        setPriceBtn = new javax.swing.JButton();
        setDaysBtn = new javax.swing.JButton();
        setTimeBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        coursesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        coursesTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        coursesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesTblMouseClicked(evt);
            }
        });
        coursesSPnl.setViewportView(coursesTbl);

        courseDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        courseDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        courseNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseNameLbl.setText("Course name :");

        courseStartDateTf.setEditable(false);

        courseIdTf.setEditable(false);

        courseIdLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseIdLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseIdLbl.setText("Course ID : ");

        courseStartDateLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseStartDateLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseStartDateLbl.setText("Start Date :");

        courseNameTf.setEditable(false);

        coursePriceLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        coursePriceLbl.setForeground(new java.awt.Color(0, 51, 153));
        coursePriceLbl.setText("Course Price :");

        coursePriceTf.setEditable(false);

        courseEndDateLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseEndDateLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseEndDateLbl.setText("End Date :");

        courseEndDateTf.setEditable(false);

        courseTimeLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseTimeLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseTimeLbl.setText("Course Time :");

        courseTimeTf.setEditable(false);

        courseDaysLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        courseDaysLbl.setForeground(new java.awt.Color(0, 51, 153));
        courseDaysLbl.setText("Course Days :");

        courseDaysTf.setEditable(false);

        javax.swing.GroupLayout courseDataPnlLayout = new javax.swing.GroupLayout(courseDataPnl);
        courseDataPnl.setLayout(courseDataPnlLayout);
        courseDataPnlLayout.setHorizontalGroup(
            courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseDataPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseDataPnlLayout.createSequentialGroup()
                        .addComponent(courseIdLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(courseDataPnlLayout.createSequentialGroup()
                        .addComponent(courseStartDateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseStartDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(courseDataPnlLayout.createSequentialGroup()
                        .addComponent(coursePriceLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(coursePriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(courseDataPnlLayout.createSequentialGroup()
                        .addComponent(courseEndDateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseEndDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(courseDataPnlLayout.createSequentialGroup()
                        .addComponent(courseTimeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseTimeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(courseDataPnlLayout.createSequentialGroup()
                        .addComponent(courseNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(courseNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(courseDataPnlLayout.createSequentialGroup()
                        .addComponent(courseDaysLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseDaysTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        courseDataPnlLayout.setVerticalGroup(
            courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseDataPnlLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseStartDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseStartDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseEndDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseEndDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursePriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursePriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseTimeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(courseDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseDaysLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseDaysTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        courseButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        courseButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        courseButtonsPnl.setAlignmentX(0.0F);
        courseButtonsPnl.setAlignmentY(0.0F);

        setNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setNameBtn.setText("Set Name");
        setNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNameBtnActionPerformed(evt);
            }
        });

        setDateBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDateBtn.setText("Set Dates");
        setDateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDateBtnActionPerformed(evt);
            }
        });

        deleteCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteCourseBtn.setText("Delete Course");
        deleteCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        setPriceBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPriceBtn.setText("Set Price");
        setPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPriceBtnActionPerformed(evt);
            }
        });

        setDaysBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setDaysBtn.setText("Set Days");
        setDaysBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDaysBtnActionPerformed(evt);
            }
        });

        setTimeBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setTimeBtn.setText("Set Time");
        setTimeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setTimeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout courseButtonsPnlLayout = new javax.swing.GroupLayout(courseButtonsPnl);
        courseButtonsPnl.setLayout(courseButtonsPnlLayout);
        courseButtonsPnlLayout.setHorizontalGroup(
            courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseButtonsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setPriceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setDaysBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setTimeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setDateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        courseButtonsPnlLayout.setVerticalGroup(
            courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNameBtn)
                    .addComponent(setDateBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setPriceBtn)
                    .addComponent(setTimeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(courseButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setDaysBtn)
                    .addComponent(deleteCourseBtn))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Everest_logo.jpg"))); // NOI18N

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(0, 51, 153));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText(EVEREST_TITLE);

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
                    .addComponent(courseDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseButtonsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(coursesSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(courseDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(courseButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(coursesSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coursesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesTblMouseClicked
        int i = coursesTbl.getSelectedRow();
        TableModel tableModel = coursesTbl.getModel();
        try {
            selectedCourse = new Course(Integer.parseInt(tableModel.getValueAt(i, 0).toString()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Selected Course doesn't Exist");
        }
        updateTable();
    }//GEN-LAST:event_coursesTblMouseClicked

    private void setNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String courseName = (String) JOptionPane.showInputDialog(rootPane, "New Course Name:",
                "Set Course Name", JOptionPane.QUESTION_MESSAGE, null, null,
                selectedCourse.getName());

        if (courseName == null) {
            return;
        } else if (courseName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Course name can't be nothing");
            return;
        }

        try {
            selectedCourse.setName(courseName);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
        updateTable();
    }//GEN-LAST:event_setNameBtnActionPerformed

    private void setDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDateBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        JFrame frame1 = promoteDatePicker("Change Course Start Date",
                "Course New Start Date :", "Set Start Date", (DateInMillis) -> {
                    try {
                        String start = new Date(DateInMillis).toString();
                        if (!isValidDateOrder(start, selectedCourse.
                                getEndDate())) {
                            JOptionPane.showMessageDialog(rootPane,
                                    "Start date must be before end date");
                        } else {
                            selectedCourse.setStartDate(start);
                            JOptionPane.showMessageDialog(rootPane,
                                    "Course Start Date Updated Successfully");
                            updateTable();
                            return true;
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                    }
                    return false;
                });
        JFrame frame2 = promoteDatePicker("Change Course End Date",
                "Course New End Date :", "Set End Date", (DateInMillis) -> {
                    try {
                        String end = new Date(DateInMillis).toString();
                        if (!isValidDateOrder(selectedCourse.getStartDate(),
                                end)) {
                            JOptionPane.showMessageDialog(rootPane,
                                    "End date must be after start date");
                        } else {
                            selectedCourse.setEndDate(end);
                            JOptionPane.showMessageDialog(rootPane,
                                    "Course End Date Updated Successfully");
                            updateTable();
                            return true;
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                    }
                    return false;
                });
        frame2.setLocation(frame1.getWidth(), 0);
        link_2frames_to_button(frame1, frame2, setDateBtn);
    }//GEN-LAST:event_setDateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane.showConfirmDialog(rootPane,
                "Are you sure you want delete Course " + courseNameTf.getText() + " ?",
                "Course Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedCourse.delete();
            selectedCourse = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
        updateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void setPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPriceBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        link_frame_to_button(promoteSpinner("Change Course Price", "Course New Price :",
                new SpinnerNumberModel(0, 0, 999.99, 10), "Set Price", (double spinnerValue) -> {
                    try {
                        selectedCourse.setPrice(spinnerValue);
                        JOptionPane.showMessageDialog(rootPane,
                                "Course Price Updated Successfully");
                        updateTable();
                        return true;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                    }
                    return false;
                }), setPriceBtn);
    }//GEN-LAST:event_setPriceBtnActionPerformed

    private void setDaysBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDaysBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        link_frame_to_button(promoteDays("Change Course Days", "Course New Days :", "Set Days",
                (days) -> {
                    try {
                        selectedCourse.setDays(days);
                        JOptionPane.showMessageDialog(rootPane, "Course Days Updated Successfully");
                        updateTable();
                        return true;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                    }
                    return false;
                }, selectedCourse.getDays()), setDaysBtn);
    }//GEN-LAST:event_setDaysBtnActionPerformed

    private void setTimeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setTimeBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        JFrame frame1 = promoteFormatedTextField("Change Course Start Time", "Course New Start Time :",
                Strings.TIME_FORMAT, "Set Start Time", (formatedText) -> {
                    try {
                        if (isValidDateOrder(formatedText, selectedCourse.getEndDate())) {
                            selectedCourse.setTimeHourFrom(formatedText);
                            JOptionPane.showMessageDialog(rootPane,
                                    "Course Start Time Updated Successfully");
                            updateTable();
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(rootPane,
                                    "Course start time MUST be after course end time");
                            return false;
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                    }
                    return false;
                });
        JFrame frame2 = promoteFormatedTextField("Change Course End Time",
                "Course New End Time :", Strings.TIME_FORMAT, "Set End Time",
                (formatedText) -> {
                    try {
                        if (isValidDateOrder(selectedCourse.getStartDate(),
                                formatedText)) {
                            selectedCourse.setTimeHourFrom(formatedText);
                            JOptionPane.showMessageDialog(rootPane,
                                    "Course End Time Updated Successfully");
                            updateTable();
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(rootPane,
                                    "Course start time MUST be after course end time");
                            return false;
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                    }
                    return false;
                });
        frame2.setLocation(frame1.getWidth(), 0);
        link_2frames_to_button(frame1, frame2, setTimeBtn);
    }//GEN-LAST:event_setTimeBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel courseButtonsPnl;
    private javax.swing.JPanel courseDataPnl;
    private javax.swing.JLabel courseDaysLbl;
    private javax.swing.JTextField courseDaysTf;
    private javax.swing.JLabel courseEndDateLbl;
    private javax.swing.JTextField courseEndDateTf;
    private javax.swing.JLabel courseIdLbl;
    private javax.swing.JTextField courseIdTf;
    private javax.swing.JLabel courseNameLbl;
    private javax.swing.JTextField courseNameTf;
    private javax.swing.JLabel coursePriceLbl;
    private javax.swing.JTextField coursePriceTf;
    private javax.swing.JLabel courseStartDateLbl;
    private javax.swing.JTextField courseStartDateTf;
    private javax.swing.JLabel courseTimeLbl;
    private javax.swing.JTextField courseTimeTf;
    private javax.swing.JScrollPane coursesSPnl;
    private javax.swing.JTable coursesTbl;
    private javax.swing.JButton deleteCourseBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton setDateBtn;
    private javax.swing.JButton setDaysBtn;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JButton setPriceBtn;
    private javax.swing.JButton setTimeBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.coursesTbl.setModel(buildTableModel(getCoursesFormated()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
        if (selectedCourse == null) {
            courseIdTf.setText("");
            courseNameTf.setText("");
            courseStartDateTf.setText("");
            courseEndDateTf.setText("");
            coursePriceTf.setText("");
            courseTimeTf.setText("");
            courseDaysTf.setText("");
        } else {
            courseIdTf.setText(String.valueOf(selectedCourse.getId()));
            courseNameTf.setText(selectedCourse.getName());
            coursePriceTf.setText(String.valueOf(selectedCourse.getPrice()));
            courseStartDateTf.setText(selectedCourse.getStartDate());
            courseEndDateTf.setText(selectedCourse.getEndDate());
            courseTimeTf.setText(selectedCourse.getTimeHourFrom() + " -> "
                    + selectedCourse.getTimeHourTo());
            courseDaysTf.setText(selectedCourse.getDays());
        }
    }

    private boolean isBadSelection() throws HeadlessException {
        if (selectedCourse == null) {
            JOptionPane.showMessageDialog(rootPane, "Choose a Course to make this opreation !");
            return true;
        }
        return false;
    }

}
