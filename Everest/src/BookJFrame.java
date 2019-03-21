
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BookJFrame extends javax.swing.JFrame {

    int Bookswitch = 0;
    double Bookprice;
    int bookID = 0;
    userEntry UserEntry = new userEntry();
    Book book = new Book();
    ArrayList<Integer> ids = new ArrayList<>();
    ArrayList<Integer> bookids = new ArrayList<>();
    ArrayList<String> bookNames = new ArrayList<>();

    public BookJFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Panel1.setVisible(false);
        // BookNameComboBox.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        AddBookBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Bookname = new javax.swing.JTextField();
        numberOfBook = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();
        ShowallBooksBtn = new javax.swing.JButton();
        ShowAvaliableBooksBtn = new javax.swing.JButton();
        GiveBtn = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        CommitBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BookNameComboBox = new javax.swing.JComboBox<>();
        BookIDLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/26814457_2075513939393983_2848345987902986793_n.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Everest Training Center");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 171, 112)));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Add a new book");

        AddBookBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        AddBookBtn.setForeground(new java.awt.Color(0, 51, 153));
        AddBookBtn.setText("Add");
        AddBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));
        jLabel14.setText("Book name:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("Price:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 153));
        jLabel16.setText("Book ID:");

        Bookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooknameActionPerformed(evt);
            }
        });

        numberOfBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfBookActionPerformed(evt);
            }
        });

        price1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price1ActionPerformed(evt);
            }
        });

        ShowallBooksBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ShowallBooksBtn.setForeground(new java.awt.Color(0, 51, 153));
        ShowallBooksBtn.setText("Show Sold Out books");
        ShowallBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowallBooksBtnActionPerformed(evt);
            }
        });

        ShowAvaliableBooksBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ShowAvaliableBooksBtn.setForeground(new java.awt.Color(0, 51, 153));
        ShowAvaliableBooksBtn.setText("Show Available books");
        ShowAvaliableBooksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAvaliableBooksBtnActionPerformed(evt);
            }
        });

        GiveBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        GiveBtn.setForeground(new java.awt.Color(0, 51, 153));
        GiveBtn.setText("Give a book to a registered student ");
        GiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiveBtnActionPerformed(evt);
            }
        });

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Enter Student ID number:");

        CommitBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CommitBtn.setForeground(new java.awt.Color(0, 51, 153));
        CommitBtn.setText("commit");
        CommitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommitBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Select Book Name:");

        BookNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BookNameComboBoxItemStateChanged(evt);
            }
        });

        BookIDLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Book ID:");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(BookNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BookIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CommitBtn)
                .addGap(89, 89, 89))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookNameComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CommitBtn)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(Bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(numberOfBook, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AddBookBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShowallBooksBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(ShowAvaliableBooksBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)
                        .addComponent(Bookname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberOfBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(price1)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddBookBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShowallBooksBtn))
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowAvaliableBooksBtn)
                    .addComponent(GiveBtn))
                .addGap(8, 8, 8))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookBtnActionPerformed
        String bookname = Bookname.getText();
        double price = Double.parseDouble(price1.getText());
        int BookID = Integer.parseInt(numberOfBook.getText());
        book.setBookName(bookname);
        book.setPrice(price);
        book.setBookId(BookID);
        // double Discount = Double.parseDouble(discount.getText());
        // book.setDiscount(Discount);
        UserEntry.createBook(book);
        JOptionPane.showMessageDialog(null, "new book has been added sucessfully");

    }//GEN-LAST:event_AddBookBtnActionPerformed

    private void BooknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BooknameActionPerformed

    private void numberOfBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfBookActionPerformed

    private void price1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price1ActionPerformed

    private void ShowallBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowallBooksBtnActionPerformed
        BookTable2 bt2 = new BookTable2();
        bt2.setVisible(true);
    }//GEN-LAST:event_ShowallBooksBtnActionPerformed

    private void ShowAvaliableBooksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAvaliableBooksBtnActionPerformed
        BookTableJframe1 btjf = new BookTableJframe1();
        btjf.setVisible(true);
    }//GEN-LAST:event_ShowAvaliableBooksBtnActionPerformed

    private void GiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiveBtnActionPerformed
        if (Panel1.isVisible() == false) {
            Bookswitch = 0;
            BookNameComboBox.setEnabled(true);
            Panel1.setVisible(true);
            this.addBook();
            GiveBtn.setText("Hide");
        } else if (Panel1.isVisible() == true) {
            Bookswitch = 1;
            BookNameComboBox.setEnabled(false);
            BookIDLabel.setText("");
            IDField.setText("");
            Panel1.setVisible(false);
            for (int i = BookNameComboBox.getItemCount() - 1; i >= 0; i--) {
                BookNameComboBox.removeItemAt(i);
            }
            //this.UpdateBook();
//            int itemCount = StdIDComboBox.getItemCount();
//            for (int i = itemCount - 1; i >= 0; i--) {
//                StdIDComboBox.removeItemAt(i);
//            }
            GiveBtn.setText("Give a book to a registered student");
            bookids.clear();
            ids.clear();
        }
    }//GEN-LAST:event_GiveBtnActionPerformed
    public void addBook() {
        if (BookNameComboBox.getItemCount() >= 1) {
            for (int i = BookNameComboBox.getItemCount() - 1; i >= 0; i--) {
                BookNameComboBox.removeItemAt(i);
            }
        }
        try {
            Connection conn = login.getConnection();
            String query = "select BookName from book where Bought = 'No'";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String book_name = rs.getString("BookName");
                BookNameComboBox.addItem(book_name);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void UpdateBook() {
        try {
            String bookname = "";
            if (BookNameComboBox.getItemCount() < 1) {
                System.out.println("Data Cleared");
            } else {
                Connection conn = login.getConnection();
                bookname = BookNameComboBox.getSelectedItem().toString();
                String query = "select Price,BookId from book where BookName =?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, bookname);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Bookprice = rs.getDouble("Price");
                    bookID = rs.getInt("BookId");
                }
                BookIDLabel.setText("" + bookID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentJFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            Logger.getLogger(AddNewPayment.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void BookNameComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BookNameComboBoxItemStateChanged
        try {
            if (Bookswitch == 0) {
                Connection conn = login.getConnection();
                String bookname = BookNameComboBox.getSelectedItem().toString();
                String query = "select Price,BookId from book where BookName =?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, bookname);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Bookprice = rs.getDouble("Price");
                    bookID = rs.getInt("BookId");
                }
                BookIDLabel.setText("" + bookID);
            } else if (Bookswitch == 1) {
                System.out.println("Can't select book");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentJFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BookNameComboBoxItemStateChanged

    private void CommitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommitBtnActionPerformed
        try {
            Connection conn = login.getConnection();
            int stdid = Integer.parseInt(IDField.toString());
            int bookid = Integer.parseInt(BookIDLabel.getText());            
            //-------------           
            String query = "INSERT INTO student_book (StdID, BookID) VALUES (?,?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, stdid);
            preparedStmt.setInt(2, bookid);
            preparedStmt.execute();
            //--------------
            String Query1 = "UPDATE book SET Bought='Yes' WHERE BookId=?";
            PreparedStatement ps = conn.prepareStatement(Query1);
            ps.setInt(1, bookid);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Committed Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(AddNewPayment.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CommitBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBookBtn;
    private javax.swing.JLabel BookIDLabel;
    private javax.swing.JComboBox<String> BookNameComboBox;
    private javax.swing.JTextField Bookname;
    private javax.swing.JButton CommitBtn;
    private javax.swing.JButton GiveBtn;
    private javax.swing.JTextField IDField;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton ShowAvaliableBooksBtn;
    private javax.swing.JButton ShowallBooksBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField numberOfBook;
    private javax.swing.JTextField price1;
    // End of variables declaration//GEN-END:variables
}
