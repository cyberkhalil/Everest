package gui.bookFrames;

import books.Book;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import students.Student;
import static students.StudentUtil.getStudentsIdAndName;
import static utils.ExceptionUtil.printEx;
import static utils.Strings.EVEREST_TITLE;
import static utils.Strings.SQL_EXCEPTION_MSG;
import static utils.gui.GUI_Util.buildComboBoxModel;
import static utils.gui.GUI_Util.displayItemsInJTable;
import static utils.gui.GUI_Util.buildTableModel;
import static utils.gui.GUI_Util.link_frame_to_button;
import static utils.gui.GUI_Util.promoteComboBox;

public class BookOperationsFrame extends javax.swing.JFrame {

    private final Book selectedBook;

    public BookOperationsFrame(Book book) {
        this.selectedBook = book;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonsPnl = new javax.swing.JPanel();
        displayStudentsBtn = new javax.swing.JButton();
        addStudentsBtn = new javax.swing.JButton();
        removeStudentsBtn = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        ButtonsPnl.setAlignmentX(0.0F);
        ButtonsPnl.setAlignmentY(0.0F);

        displayStudentsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayStudentsBtn.setText("display students");
        displayStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayStudentsBtnActionPerformed(evt);
            }
        });

        addStudentsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addStudentsBtn.setText("add students");
        addStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentsBtnActionPerformed(evt);
            }
        });

        removeStudentsBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeStudentsBtn.setText("remove students");
        removeStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPnlLayout = new javax.swing.GroupLayout(ButtonsPnl);
        ButtonsPnl.setLayout(ButtonsPnlLayout);
        ButtonsPnlLayout.setHorizontalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addStudentsBtn)
                .addGap(15, 15, 15)
                .addComponent(displayStudentsBtn)
                .addGap(15, 15, 15)
                .addComponent(removeStudentsBtn)
                .addGap(20, 20, 20))
        );
        ButtonsPnlLayout.setVerticalGroup(
            ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPnlLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(ButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayStudentsBtn)
                    .addComponent(addStudentsBtn)
                    .addComponent(removeStudentsBtn))
                .addContainerGap(117, Short.MAX_VALUE))
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

    private void displayStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayStudentsBtnActionPerformed
        link_frame_to_button(displayItemsInJTable((table) -> {
            try {
                table.setModel(buildTableModel(selectedBook.getStudentsFormated()));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                printEx(ex);
            }
        }), displayStudentsBtn);
    }//GEN-LAST:event_displayStudentsBtnActionPerformed

    private void removeStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentsBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Remove Student", "student id:",
                    "remove from book", buildComboBoxModel(selectedBook.getStudentsIdAndName()),
                    (choice) -> {
                        try {
                            new Student(Integer.parseInt(choice.substring(1, choice.indexOf(")")))).
                                    removeFromBook(selectedBook.getId());
                            JOptionPane.showMessageDialog(rootPane,
                                    "Student removed from book sucessfully");
                            return true;
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                            printEx(ex);
                        }
                        return false;
                    }), removeStudentsBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_removeStudentsBtnActionPerformed

    private void addStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentsBtnActionPerformed
        try {
            link_frame_to_button(promoteComboBox("Add Student", "student id:", "Add to book",
                    buildComboBoxModel(getStudentsIdAndName()), (choice) -> {
                try {
                    new Student(Integer.parseInt(choice.substring(1, choice.indexOf(")")))).
                            buyBook(selectedBook.getId());
                    JOptionPane.showMessageDialog(rootPane, "Student added to book sucessfully");
                    return true;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                    printEx(ex);
                }
                return false;
            }), addStudentsBtn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_addStudentsBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPnl;
    private javax.swing.JButton addStudentsBtn;
    private javax.swing.JButton displayStudentsBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton removeStudentsBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

}
