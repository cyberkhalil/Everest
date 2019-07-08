package gui.bookFrames;

import static books.BookUtil.createBook;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import static utils.ExceptionUtil.printEx;
import static utils.Strings.EMPTY;
import static utils.Strings.SQL_EXCEPTION_MSG;
import static utils.Strings.BOOK_NAME_ERR_MSG;
import static utils.Strings.BOOK_CREATED_SCS_MSG;
import static utils.Strings.EVEREST_TITLE;

public class BookAddFrame extends javax.swing.JFrame {

    public BookAddFrame() {
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
        addBookBtn = new javax.swing.JButton();
        bookNameLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        bookNameTf = new javax.swing.JTextField();
        bookPriceSp = new javax.swing.JSpinner();
        quantityLbl = new javax.swing.JLabel();
        bookQuantitySp = new javax.swing.JSpinner();
        bookISBN_Tf = new javax.swing.JTextField();
        BookISBN_CB = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        titlePnl.setBackground(new java.awt.Color(255, 255, 255));
        titlePnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

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
        contentTitleLbl.setText("Add a new Book");

        addBookBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addBookBtn.setForeground(new java.awt.Color(0, 51, 153));
        addBookBtn.setText("Add");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });

        bookNameLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bookNameLbl.setForeground(new java.awt.Color(0, 51, 153));
        bookNameLbl.setText("Book name:");

        priceLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        priceLbl.setForeground(new java.awt.Color(0, 51, 153));
        priceLbl.setText("Price:");

        bookPriceSp.setModel(new SpinnerNumberModel(0,0,999.99,1));

        quantityLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        quantityLbl.setForeground(new java.awt.Color(0, 51, 153));
        quantityLbl.setText("Quantity:");

        bookQuantitySp.setModel(new SpinnerNumberModel(0,0,1000,1));

        bookISBN_Tf.setEnabled(false);

        BookISBN_CB.setBackground(new java.awt.Color(255, 255, 255));
        BookISBN_CB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BookISBN_CB.setForeground(new java.awt.Color(0, 51, 153));
        BookISBN_CB.setText("ISBN:");
        BookISBN_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookISBN_CBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPnlLayout = new javax.swing.GroupLayout(contentPnl);
        contentPnl.setLayout(contentPnlLayout);
        contentPnlLayout.setHorizontalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentTitleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPnlLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookNameLbl)
                    .addComponent(priceLbl)
                    .addComponent(quantityLbl)
                    .addComponent(BookISBN_CB))
                .addGap(33, 33, 33)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookISBN_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookPriceSp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookQuantitySp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        contentPnlLayout.setVerticalGroup(
            contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contentTitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookNameLbl))
                .addGap(18, 18, 18)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLbl)
                    .addComponent(bookPriceSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLbl)
                    .addComponent(bookQuantitySp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookISBN_Tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookISBN_CB))
                .addGap(28, 28, 28)
                .addComponent(addBookBtn)
                .addContainerGap())
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
                .addComponent(contentPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        if (bookNameTf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, BOOK_NAME_ERR_MSG);
            return;
        }
        try {
            if (BookISBN_CB.isSelected()) {
                createBook(bookNameTf.getText(), (double) bookPriceSp.getValue(),
                        (int) bookQuantitySp.getValue(), bookISBN_Tf.getText());
            } else {
                createBook(bookNameTf.getText(), (double) bookPriceSp.getValue(),
                        (int) bookQuantitySp.getValue());
            }
            JOptionPane.showMessageDialog(this, BOOK_CREATED_SCS_MSG);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, SQL_EXCEPTION_MSG);
            printEx(ex);
        }
    }//GEN-LAST:event_addBookBtnActionPerformed

    private void BookISBN_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookISBN_CBActionPerformed
        if (BookISBN_CB.isSelected()) {
            bookISBN_Tf.setEnabled(true);
        } else {
            bookISBN_Tf.setText(EMPTY);
            bookISBN_Tf.setEnabled(false);
        }
    }//GEN-LAST:event_BookISBN_CBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BookISBN_CB;
    private javax.swing.JButton addBookBtn;
    private javax.swing.JTextField bookISBN_Tf;
    private javax.swing.JLabel bookNameLbl;
    private javax.swing.JTextField bookNameTf;
    private javax.swing.JSpinner bookPriceSp;
    private javax.swing.JSpinner bookQuantitySp;
    private javax.swing.JPanel contentPnl;
    private javax.swing.JLabel contentTitleLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JLabel quantityLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JPanel titlePnl;
    // End of variables declaration//GEN-END:variables
}
