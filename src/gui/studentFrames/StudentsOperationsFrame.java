package gui.studentFrames;

import static books.BookUtil.getBooksIdAndName;
import static courses.CourseUtil.getCoursesIdAndName;
import static exams.ExamUtil.getExamsIdAndName;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import students.Student;
import static utils.ExceptionUtil.printEx;
import static utils.Strings.EVEREST_TITLE;
import static utils.Strings.SQL_EXCEPTION_MSG;
import static utils.gui.GUI_Util.buildComboBoxModel;
import static utils.gui.GUI_Util.buildTableModel;
import static utils.gui.GUI_Util.displayItemsInJTable;
import static utils.gui.GUI_Util.link_frame_to_button;
import static utils.gui.GUI_Util.promoteComboBox;
import static utils.gui.GUI_Util.promoteComboBoxAndSpinner;
import static utils.gui.GUI_Util.promoteSpinner;

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
        enrollToCourseBtn = new javax.swing.JButton();
        displayCoursesBtn = new javax.swing.JButton();
        displayBooksBtn = new javax.swing.JButton();
        displayExamsBtn = new javax.swing.JButton();
        removeFromCourseBtn = new javax.swing.JButton();
        addToExamBtn = new javax.swing.JButton();
        displayBalanceBtn = new javax.swing.JButton();
        purchaseMoneyBtn = new javax.swing.JButton();
        removeFromBookBtn = new javax.swing.JButton();
        removeFromExamBtn = new javax.swing.JButton();
        removePurchaseBtn = new javax.swing.JButton();
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

        enrollToCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enrollToCourseBtn.setText("Enroll To Course");
        enrollToCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollToCourseBtnActionPerformed(evt);
            }
        });

        displayCoursesBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayCoursesBtn.setText("Display Courses");
        displayCoursesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCoursesBtnActionPerformed(evt);
            }
        });

        displayBooksBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayBooksBtn.setText("Display Books");
        displayBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBooksBtnActionPerformed(evt);
            }
        });

        displayExamsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayExamsBtn.setText("Display Exams");
        displayExamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayExamsBtnActionPerformed(evt);
            }
        });

        removeFromCourseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeFromCourseBtn.setText("Remove From Course");
        removeFromCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromCourseBtnActionPerformed(evt);
            }
        });

        addToExamBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addToExamBtn.setText("Add To Exam");
        addToExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToExamBtnActionPerformed(evt);
            }
        });

        displayBalanceBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayBalanceBtn.setText("Display Balance");
        displayBalanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBalanceBtnActionPerformed(evt);
            }
        });

        purchaseMoneyBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        purchaseMoneyBtn.setText("Purchase Money");
        purchaseMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseMoneyBtnActionPerformed(evt);
            }
        });

        removeFromBookBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeFromBookBtn.setText("Remove From Book");
        removeFromBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromBookBtnActionPerformed(evt);
            }
        });

        removeFromExamBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeFromExamBtn.setText("Remove From Exam");
        removeFromExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromExamBtnActionPerformed(evt);
            }
        });

        removePurchaseBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removePurchaseBtn.setText("Remove Purchase");
        removePurchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePurchaseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPnlLayout = new javax.swing.GroupLayout(ButtonsPnl);
        ButtonsPnl.setLayout(ButtonsPnlLayout);
        ButtonsPnlLayout.setHorizontalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enrollToCourseBtn)
                    .addComponent(buyBookBtn)
                    .addComponent(addToExamBtn)
                    .addComponent(purchaseMoneyBtn))
                .addGap(20, 20, 20)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayCoursesBtn)
                    .addComponent(displayBooksBtn)
                    .addComponent(displayExamsBtn)
                    .addComponent(displayBalanceBtn))
                .addGap(20, 20, 20)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeFromExamBtn)
                    .addComponent(removeFromBookBtn)
                    .addComponent(removeFromCourseBtn)
                    .addComponent(removePurchaseBtn))
                .addGap(30, 30, 30))
        );
        ButtonsPnlLayout.setVerticalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyBookBtn)
                    .addComponent(displayBooksBtn)
                    .addComponent(removeFromBookBtn))
                .addGap(20, 20, 20)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enrollToCourseBtn)
                    .addComponent(displayCoursesBtn)
                    .addComponent(removeFromCourseBtn))
                .addGap(20, 20, 20)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayExamsBtn)
                    .addComponent(addToExamBtn)
                    .addComponent(removeFromExamBtn))
                .addGap(20, 20, 20)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayBalanceBtn)
                    .addComponent(purchaseMoneyBtn)
                    .addComponent(removePurchaseBtn))
                .addGap(30, 30, 30))
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
            link_frame_to_button(promoteComboBoxAndSpinner("Buy A Book", "Book Id :",
                    buildComboBoxModel(getBooksIdAndName()), "Book quantity",
                    new SpinnerNumberModel(0, 0, 1000, 1), "Buy Book", (choice, value) -> {
                        try {
                            selectedStudent.buyBook(Integer.parseInt(choice.substring(1,
                                    choice.indexOf(")"))), (int) value);
                            JOptionPane.showMessageDialog(rootPane,
                                    "Student bought " + value + " from this book successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), buyBookBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_buyBookBtnActionPerformed

    private void enrollToCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollToCourseBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Course Enroll", "Choose course to enroll",
                    "Enroll to course", buildComboBoxModel(getCoursesIdAndName()),
                    (choice) -> {
                        try {
                            selectedStudent.enrollToCourse(Integer.parseInt(
                                    choice.substring(1, choice.indexOf(")"))));
                            JOptionPane.showMessageDialog(rootPane,
                                    "Student enrolled to this course successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), enrollToCourseBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_enrollToCourseBtnActionPerformed

    private void displayCoursesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCoursesBtnActionPerformed
        link_frame_to_button(displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedStudent.getCoursesIdAndName()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                printEx(ex);
            }
        }), displayCoursesBtn);
    }//GEN-LAST:event_displayCoursesBtnActionPerformed

    private void displayBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBooksBtnActionPerformed
        link_frame_to_button(displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedStudent.getBooksFormated()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                printEx(ex);
            }
        }), displayBooksBtn);
    }//GEN-LAST:event_displayBooksBtnActionPerformed

    private void displayExamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayExamsBtnActionPerformed
        link_frame_to_button(displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedStudent.getExamsFormated()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                printEx(ex);
            }
        }), displayExamsBtn);
    }//GEN-LAST:event_displayExamsBtnActionPerformed

    private void removeFromCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromCourseBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Course Remove", "Choose course to remove",
                    "Remove course", buildComboBoxModel(selectedStudent.getCoursesIdAndName()),
                    (choice) -> {
                        try {
                            selectedStudent.removeFromCourse(Integer.parseInt(
                                    choice.substring(1, choice.indexOf(")"))));
                            JOptionPane.showMessageDialog(rootPane,
                                    "Student removed from this course successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), removeFromCourseBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_removeFromCourseBtnActionPerformed

    private void addToExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToExamBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Exam Add", "Choose exam to add", "Add to exam",
                    buildComboBoxModel(getExamsIdAndName()), (choice) -> {
                try {
                    selectedStudent.addToExam(Integer.parseInt(
                            choice.substring(1, choice.indexOf(")"))));
                    JOptionPane.showMessageDialog(rootPane,
                            "Student added to this exam successfully");
                    return true;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                    printEx(ex);
                }
                return false;
            }), addToExamBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_addToExamBtnActionPerformed

    private void displayBalanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBalanceBtnActionPerformed
        link_frame_to_button(displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedStudent.getBalance()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                printEx(ex);
            }
        }), displayBalanceBtn);
    }//GEN-LAST:event_displayBalanceBtnActionPerformed

    private void purchaseMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseMoneyBtnActionPerformed
        link_frame_to_button(promoteSpinner("Student Puchase", "Puchase Price :",
                new SpinnerNumberModel(0, 0, 999.99, 10), "Add Purchase", (double spinnerValue) -> {
                    try {
                        selectedStudent.purchaseMoney(spinnerValue);
                        JOptionPane.showMessageDialog(rootPane,
                                "Student Puchrase Done Successfully");
                        return true;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                    }
                    return false;
                }), purchaseMoneyBtn);
    }//GEN-LAST:event_purchaseMoneyBtnActionPerformed

    private void removeFromBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromBookBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Book Remove", "Choose book to remove",
                    "Remove book", buildComboBoxModel(selectedStudent.getBooksFormated()),
                    (choice) -> {
                        try {
                            selectedStudent.removeFromBook(Integer.parseInt(
                                    choice.substring(1, choice.indexOf(")"))));
                            JOptionPane.showMessageDialog(rootPane,
                                    "Student returned this book successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), removeFromBookBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_removeFromBookBtnActionPerformed

    private void removeFromExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromExamBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Exam Remove", "Choose exam to remove",
                    "Remove exam", buildComboBoxModel(selectedStudent.getExamsIdAndName()),
                    (choice) -> {
                        try {
                            selectedStudent.removeFromExam(Integer.parseInt(
                                    choice.substring(1, choice.indexOf(")"))));
                            JOptionPane.showMessageDialog(rootPane,
                                    "Student removed from this exam successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), removeFromExamBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_removeFromExamBtnActionPerformed

    private void removePurchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePurchaseBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Purchase Remove", "Choose purchase to remove",
                    "Remove purchase", buildComboBoxModel(selectedStudent.getPurchasesIdAndPrice()),
                    (choice) -> {
                        try {
                            selectedStudent.removePruchase(Integer.parseInt(
                                    choice.substring(4, choice.indexOf(")"))));
                            JOptionPane.showMessageDialog(rootPane,
                                    "Student purchase removed successfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), removePurchaseBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_removePurchaseBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPnl;
    private javax.swing.JButton addToExamBtn;
    private javax.swing.JButton buyBookBtn;
    private javax.swing.JButton displayBalanceBtn;
    private javax.swing.JButton displayBooksBtn;
    private javax.swing.JButton displayCoursesBtn;
    private javax.swing.JButton displayExamsBtn;
    private javax.swing.JButton enrollToCourseBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton purchaseMoneyBtn;
    private javax.swing.JButton removeFromBookBtn;
    private javax.swing.JButton removeFromCourseBtn;
    private javax.swing.JButton removeFromExamBtn;
    private javax.swing.JButton removePurchaseBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
