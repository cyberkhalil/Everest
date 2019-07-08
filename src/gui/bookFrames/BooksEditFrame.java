package gui.bookFrames;

import books.Book;
import static books.BookUtil.getBooksFormated;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableModel;
import static utils.ExceptionUtil.printEx;
import static utils.Strings.BOOK_DELETE_BTN;
import static utils.Strings.BOOK_DELETE_CNFRM;
import static utils.Strings.BOOK_NEW_NAME_BTN;
import static utils.Strings.EMPTY;
import static utils.Strings.SQL_EXCEPTION_MSG;
import static utils.gui.GUI_Util.buildTableModel;
import static utils.gui.GUI_Util.link_frame_to_button;
import static utils.gui.GUI_Util.promoteSpinner;
import static utils.Strings.BOOK_NEW_NAME_LBL;
import static utils.Strings.BOOK_EXIST_ERR_MSG;
import static utils.Strings.BOOK_EMPTY_NAME_ERR_MSG;
import static utils.Strings.EVEREST_TITLE;
import static utils.Strings.QUESTION_MRK;
import static utils.Strings.SPACE;

public class BooksEditFrame extends javax.swing.JFrame {

    private Book selectedBook;

    public BooksEditFrame() {
        initComponents();
        try {
            this.booksTbl.setModel(buildTableModel(getBooksFormated()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        booksViewSPnl = new javax.swing.JScrollPane();
        booksTbl = new javax.swing.JTable();
        bookDataPnl = new javax.swing.JPanel();
        bookNameLbl = new javax.swing.JLabel();
        bookQuantityTf = new javax.swing.JTextField();
        bookIdTf = new javax.swing.JTextField();
        bookIdLbl = new javax.swing.JLabel();
        bookQuantityLbl = new javax.swing.JLabel();
        bookNameTf = new javax.swing.JTextField();
        bookPriceLbl = new javax.swing.JLabel();
        bookPriceTf = new javax.swing.JTextField();
        bookSoldLbl = new javax.swing.JLabel();
        bookSoldTf = new javax.swing.JTextField();
        bookButtonsPnl = new javax.swing.JPanel();
        setNameBtn = new javax.swing.JButton();
        setQuantityBtn = new javax.swing.JButton();
        setPriceBtn = new javax.swing.JButton();
        deleteBookBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        titlePnl = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        booksTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        booksTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        booksTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksTblMouseClicked(evt);
            }
        });
        booksViewSPnl.setViewportView(booksTbl);

        bookDataPnl.setBackground(new java.awt.Color(255, 255, 255));
        bookDataPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        bookNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bookNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        bookNameLbl.setText("Book name :");

        bookQuantityTf.setEditable(false);

        bookIdTf.setEditable(false);

        bookIdLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bookIdLbl.setForeground(new java.awt.Color(0, 51, 153));
        bookIdLbl.setText("Book ID   :");

        bookQuantityLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bookQuantityLbl.setForeground(new java.awt.Color(0, 51, 153));
        bookQuantityLbl.setText("Book Quantity:");

        bookNameTf.setEditable(false);

        bookPriceLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bookPriceLbl.setForeground(new java.awt.Color(0, 51, 153));
        bookPriceLbl.setText("Book Price :");

        bookPriceTf.setEditable(false);

        bookSoldLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bookSoldLbl.setForeground(new java.awt.Color(0, 51, 153));
        bookSoldLbl.setText("Sold Books :");

        bookSoldTf.setEditable(false);

        javax.swing.GroupLayout bookDataPnlLayout = new javax.swing.GroupLayout(bookDataPnl);
        bookDataPnl.setLayout(bookDataPnlLayout);
        bookDataPnlLayout.setHorizontalGroup(
            bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDataPnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookDataPnlLayout.createSequentialGroup()
                        .addComponent(bookSoldLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookSoldTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookDataPnlLayout.createSequentialGroup()
                        .addComponent(bookPriceLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookPriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookDataPnlLayout.createSequentialGroup()
                        .addComponent(bookQuantityLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(bookQuantityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookDataPnlLayout.createSequentialGroup()
                        .addGroup(bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bookIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookNameTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookIdTf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        bookDataPnlLayout.setVerticalGroup(
            bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDataPnlLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookQuantityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookQuantityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookPriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookPriceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(bookDataPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookSoldLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookSoldTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bookButtonsPnl.setBackground(new java.awt.Color(255, 255, 255));
        bookButtonsPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        bookButtonsPnl.setAlignmentX(0.0F);
        bookButtonsPnl.setAlignmentY(0.0F);

        setNameBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setNameBtn.setText("Set Name");
        setNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNameBtnActionPerformed(evt);
            }
        });

        setQuantityBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setQuantityBtn.setText("Set Quantity");
        setQuantityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setQuantityBtnActionPerformed(evt);
            }
        });

        setPriceBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        setPriceBtn.setText("Set Price");
        setPriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPriceBtnActionPerformed(evt);
            }
        });

        deleteBookBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteBookBtn.setText("Delete Book");
        deleteBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("other Operations");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookButtonsPnlLayout = new javax.swing.GroupLayout(bookButtonsPnl);
        bookButtonsPnl.setLayout(bookButtonsPnlLayout);
        bookButtonsPnlLayout.setHorizontalGroup(
            bookButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookButtonsPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setPriceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(bookButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookButtonsPnlLayout.createSequentialGroup()
                        .addComponent(setQuantityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookButtonsPnlLayout.createSequentialGroup()
                        .addComponent(deleteBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(86, 86, 86))
        );
        bookButtonsPnlLayout.setVerticalGroup(
            bookButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookButtonsPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bookButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setNameBtn)
                    .addComponent(setQuantityBtn))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(bookButtonsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setPriceBtn)
                    .addComponent(deleteBookBtn))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePnlLayout.setVerticalGroup(
            titlePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(titlePnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(titleLbl))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookDataPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookButtonsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(booksViewSPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
            .addComponent(titlePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookDataPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(bookButtonsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(booksViewSPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booksTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTblMouseClicked
        int i = booksTbl.getSelectedRow();
        TableModel tableModel = booksTbl.getModel();
        try {
            selectedBook = new Book(Integer.parseInt(tableModel.getValueAt(i, 0).toString()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, BOOK_EXIST_ERR_MSG);
            printEx(ex);
        }
        updateTable();
    }//GEN-LAST:event_booksTblMouseClicked

    private void setNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNameBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        String newBookName = (String) JOptionPane.showInputDialog(rootPane, BOOK_NEW_NAME_LBL,
                BOOK_NEW_NAME_BTN, QUESTION_MESSAGE, null, null, selectedBook.getName());

        if (newBookName == null) {
            return;
        } else if (newBookName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, BOOK_EMPTY_NAME_ERR_MSG);
            return;
        }
        try {
            selectedBook.setName(newBookName);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
        updateTable();
    }//GEN-LAST:event_setNameBtnActionPerformed

    private void deleteBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        boolean deleteConfirmation = JOptionPane.showConfirmDialog(rootPane, BOOK_DELETE_CNFRM
                + SPACE + bookNameTf.getText() + SPACE + QUESTION_MRK, BOOK_DELETE_BTN,
                YES_NO_OPTION) == YES_OPTION;
        if (!deleteConfirmation) {
            return;
        }
        try {
            selectedBook.delete();
            selectedBook = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
        updateTable();
    }//GEN-LAST:event_deleteBookBtnActionPerformed

    private boolean isBadSelection() throws HeadlessException {
        if (selectedBook == null) {
            JOptionPane.showMessageDialog(rootPane, "Choose a Book to make this opreation !");
            return true;
        }
        return false;
    }

    private void setQuantityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setQuantityBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        link_frame_to_button(promoteSpinner("Change Book Quantity", "Book New Quantity :",
                new SpinnerNumberModel(0, 0, 9999, 10), "Set Quantity", (double spinnerValue) -> {
                    try {
                        selectedBook.setQuantity((int) spinnerValue);
                        JOptionPane.showMessageDialog(rootPane,
                                "Book Quantity Updated Successfully");
                        return true;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                        return false;
                    }
                }), setQuantityBtn);
        updateTable();
    }//GEN-LAST:event_setQuantityBtnActionPerformed

    private void setPriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPriceBtnActionPerformed
        if (isBadSelection()) {
            return;
        }
        link_frame_to_button(promoteSpinner("Change Book Price", "Book New Price :",
                new SpinnerNumberModel(0, 0, 999.99, 10), "Set Price", (double spinnerValue) -> {
                    try {
                        selectedBook.setPrice((double) spinnerValue);
                        JOptionPane.showMessageDialog(rootPane, "Book Price Updated Successfully");
                        return true;
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
                        printEx(ex);
                        return false;
                    }
                }), setPriceBtn);
        updateTable();
    }//GEN-LAST:event_setPriceBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isBadSelection()) {
            return;
        }
        JFrame frame = new BookOperationsFrame(selectedBook);
        link_frame_to_button(frame, jButton1);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bookButtonsPnl;
    private javax.swing.JPanel bookDataPnl;
    private javax.swing.JLabel bookIdLbl;
    private javax.swing.JTextField bookIdTf;
    private javax.swing.JLabel bookNameLbl;
    private javax.swing.JTextField bookNameTf;
    private javax.swing.JLabel bookPriceLbl;
    private javax.swing.JTextField bookPriceTf;
    private javax.swing.JLabel bookQuantityLbl;
    private javax.swing.JTextField bookQuantityTf;
    private javax.swing.JLabel bookSoldLbl;
    private javax.swing.JTextField bookSoldTf;
    private javax.swing.JTable booksTbl;
    private javax.swing.JScrollPane booksViewSPnl;
    private javax.swing.JButton deleteBookBtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton setNameBtn;
    private javax.swing.JButton setPriceBtn;
    private javax.swing.JButton setQuantityBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        try {
            this.booksTbl.setModel(buildTableModel(getBooksFormated()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
        if (selectedBook == null) {
            bookIdTf.setText(EMPTY);
            bookNameTf.setText(EMPTY);
            bookPriceTf.setText(EMPTY);
            bookQuantityTf.setText(EMPTY);
            bookSoldTf.setText(EMPTY);
        } else {
            bookIdTf.setText(String.valueOf(selectedBook.getId()));
            bookNameTf.setText(selectedBook.getName());
            bookPriceTf.setText(String.valueOf(selectedBook.getPrice()));
            bookQuantityTf.setText(String.valueOf(selectedBook.getQuantity()));
            bookSoldTf.setText(String.valueOf(selectedBook.getSold()));
        }
    }
}
