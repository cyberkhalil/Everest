package gui.studentFrames;

import books.BookUtil;
import courses.CourseUtil;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import students.Student;
import static utils.gui.GUI_Util.buildComboBoxModel;
import static utils.gui.GUI_Util.buildTableModel;
import static utils.gui.GUI_Util.displayItemsInJTable;
import static utils.gui.GUI_Util.promoteComboBox;

public class StudentsOperationsFrame extends javax.swing.JFrame {

    private final Student selectedStudent;

    public StudentsOperationsFrame(Student student) {
        this.selectedStudent = student;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonsPnl = new javax.swing.JPanel();
        buyBookBtn = new javax.swing.JButton();
        enrolToCourseBtn = new javax.swing.JButton();
        displayCoursesBtn = new javax.swing.JButton();
        displayBooksBtn = new javax.swing.JButton();
        displayExamsBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        ButtonsPnl.setAlignmentX(0.0F);
        ButtonsPnl.setAlignmentY(0.0F);

        buyBookBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buyBookBtn.setText("Buy Book");
        buyBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBookBtnActionPerformed(evt);
            }
        });

        enrolToCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enrolToCourseBtn.setText("Enrol to course");
        enrolToCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrolToCourseBtnActionPerformed(evt);
            }
        });

        displayCoursesBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayCoursesBtn.setText("display Courses");
        displayCoursesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCoursesBtnActionPerformed(evt);
            }
        });

        displayBooksBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayBooksBtn.setText("display Books");
        displayBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBooksBtnActionPerformed(evt);
            }
        });

        displayExamsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayExamsBtn.setText("display Exams");
        displayExamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayExamsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPnlLayout = new javax.swing.GroupLayout(ButtonsPnl);
        ButtonsPnl.setLayout(ButtonsPnlLayout);
        ButtonsPnlLayout.setHorizontalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enrolToCourseBtn)
                    .addComponent(buyBookBtn))
                .addGap(49, 49, 49)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayExamsBtn)
                    .addComponent(displayBooksBtn)
                    .addComponent(displayCoursesBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonsPnlLayout.setVerticalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyBookBtn)
                    .addComponent(displayBooksBtn))
                .addGap(25, 25, 25)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enrolToCourseBtn)
                    .addComponent(displayCoursesBtn))
                .addGap(25, 25, 25)
                .addComponent(displayExamsBtn)
                .addContainerGap(43, Short.MAX_VALUE))
        );

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
                .addComponent(imgLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
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
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBookBtnActionPerformed
        try {
            promoteComboBox("Buy A Book", "Choose Book Id to buy", "Buy Book",
                    buildComboBoxModel(BookUtil.getBooksIdAlongWithName()), (choice) -> {
                try {
                    selectedStudent.buyBook(Integer.parseInt(choice));
                    JOptionPane.showMessageDialog(rootPane,
                            "Student bought this book successfully");
                    return true;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
                return false;
            });
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_buyBookBtnActionPerformed

    private void enrolToCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrolToCourseBtnActionPerformed
        try {
            promoteComboBox("Enrol To Course", "Choose Course Id to enrol", "Enrol To Course",
                    buildComboBoxModel(CourseUtil.getCoursesIdAlongWithName()), (choice) -> {
                try {
                    selectedStudent.enrollToCourse(Integer.parseInt(choice));
                    JOptionPane.showMessageDialog(rootPane,
                            "Student enrolled to this course successfully");
                    return true;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
                return false;
            });
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_enrolToCourseBtnActionPerformed

    private void displayCoursesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCoursesBtnActionPerformed
        displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedStudent.getCourses()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        });
    }//GEN-LAST:event_displayCoursesBtnActionPerformed

    private void displayBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBooksBtnActionPerformed
        displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedStudent.getBooks()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        });
    }//GEN-LAST:event_displayBooksBtnActionPerformed

    private void displayExamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayExamsBtnActionPerformed
        displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedStudent.getExams()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
        });
    }//GEN-LAST:event_displayExamsBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPnl;
    private javax.swing.JButton buyBookBtn;
    private javax.swing.JButton displayBooksBtn;
    private javax.swing.JButton displayCoursesBtn;
    private javax.swing.JButton displayExamsBtn;
    private javax.swing.JButton enrolToCourseBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
