package gui.courseFrames;

import courses.CourseUtil;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class CourseAddFrame extends javax.swing.JFrame {

    public CourseAddFrame() {
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
        courseDaysFtf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        try {
            courseDaysFtf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UL,UL,UL,UL,UL,UL,UL")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        courseDaysFtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout contentPnlLayout = new javax.swing.GroupLayout(contentPnl);
        contentPnl.setLayout(contentPnlLayout);
        contentPnlLayout.setHorizontalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLbl)
                    .addGroup(contentPnlLayout.createSequentialGroup()
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseNameLbl)
                            .addComponent(coursePriceLbl)
                            .addComponent(startDateLbl)
                            .addComponent(startTimeLbl)
                            .addComponent(endTimeLbl)
                            .addComponent(daysLbl))
                        .addGap(33, 33, 33)
                        .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(courseDaysFtf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(courseEndTimeFtf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(courseStartTimeFtf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(courseStartDateDP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cousrePriceSp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(courseEndDateDP, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))))
                .addContainerGap(17, Short.MAX_VALUE))
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
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseDaysFtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysLbl))
                .addGap(18, 18, 18)
                .addComponent(addCourseBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseBtnActionPerformed
        try {
            CourseUtil.createCourse(courseNameTf.getText(),
                    new Date(courseStartDateDP.getDateInMillis()),
                    new Date(courseEndDateDP.getDateInMillis()),
                    (double) cousrePriceSp.getValue(),
                    courseEndTimeFtf.getText(),
                    courseStartTimeFtf.getText(),
                    courseDaysFtf.getText());

            JOptionPane.showMessageDialog(this,
                    "New Course created successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_addCourseBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourseBtn;
    private javax.swing.JPanel contentPnl;
    private javax.swing.JLabel contentTitleLbl;
    private javax.swing.JFormattedTextField courseDaysFtf;
    private org.jdesktop.swingx.JXDatePicker courseEndDateDP;
    private javax.swing.JFormattedTextField courseEndTimeFtf;
    private javax.swing.JLabel courseNameLbl;
    private javax.swing.JTextField courseNameTf;
    private javax.swing.JLabel coursePriceLbl;
    private org.jdesktop.swingx.JXDatePicker courseStartDateDP;
    private javax.swing.JFormattedTextField courseStartTimeFtf;
    private javax.swing.JSpinner cousrePriceSp;
    private javax.swing.JLabel daysLbl;
    private javax.swing.JLabel endDateLbl;
    private javax.swing.JLabel endTimeLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel startDateLbl;
    private javax.swing.JLabel startTimeLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables
}
