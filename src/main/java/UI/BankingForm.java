/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.BankingValidator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyra Balliram
 */
public class BankingForm extends javax.swing.JFrame {

    /**
     * Creates new form BankingDetails
     */
    private BankingValidator v;
    private boolean cardNumVal = true;
    private boolean expirationVal = true;
    private boolean cvvVal = true;
    private boolean firstNameVal = true;
    private boolean lastNameVal = true;
    private boolean idNumVal = true;
    private boolean genderVal = true;

    public BankingForm() {
        initComponents();
        v = new BankingValidator();

        //make a data model
        DefaultComboBoxModel yearBox = new DefaultComboBoxModel();
        //populate model   
        for (int i = 1967; i <= 2050; i++) {
            cardYearComboBox.setModel(yearBox);
            String strYear = Integer.toString(i);
            cardYearComboBox.addItem(strYear);
        }

        DefaultComboBoxModel monthBox = new DefaultComboBoxModel();
        for (int i = 1; i <= 12; i++) {
            cardMonthCombo.setModel(monthBox);
            String strMonth = Integer.toString(i);
            cardMonthCombo.addItem(strMonth);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        JPaneBox = new javax.swing.JDialog();
        genderButtons = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        PayPalLbl = new javax.swing.JLabel();
        CardNbrLbl = new javax.swing.JLabel();
        monthlbl = new javax.swing.JLabel();
        yearlbl = new javax.swing.JLabel();
        cvvlbl = new javax.swing.JLabel();
        CvvTxtField = new javax.swing.JTextField();
        cardNbrTxtField = new javax.swing.JTextField();
        lastNamelbl = new javax.swing.JLabel();
        firstNameTxtField = new javax.swing.JTextField();
        firstNamelbl = new javax.swing.JLabel();
        LastNameTxtField = new javax.swing.JTextField();
        cardYearComboBox = new javax.swing.JComboBox<>();
        maleButton = new javax.swing.JRadioButton();
        addCardButton = new javax.swing.JButton();
        errorlbl6 = new javax.swing.JLabel();
        IdNumlbl = new javax.swing.JLabel();
        IdNumTxtField = new javax.swing.JTextField();
        errorlbl7 = new javax.swing.JLabel();
        femaleButton = new javax.swing.JRadioButton();
        cardMonthCombo = new javax.swing.JComboBox<>();
        errorlbl2 = new javax.swing.JLabel();
        errorlbl3 = new javax.swing.JLabel();
        errorlbl5 = new javax.swing.JLabel();
        errorlbl4 = new javax.swing.JLabel();
        errorlbl1 = new javax.swing.JLabel();

        javax.swing.GroupLayout JPaneBoxLayout = new javax.swing.GroupLayout(JPaneBox.getContentPane());
        JPaneBox.getContentPane().setLayout(JPaneBoxLayout);
        JPaneBoxLayout.setHorizontalGroup(
            JPaneBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JPaneBoxLayout.setVerticalGroup(
            JPaneBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PayPalLbl.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        PayPalLbl.setForeground(new java.awt.Color(0, 153, 204));
        PayPalLbl.setText("PAYPAL");
        jPanel3.add(PayPalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 104, 26));

        CardNbrLbl.setText("Card Number (no spaces)");
        jPanel3.add(CardNbrLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, -1));

        monthlbl.setText("MM'");
        jPanel3.add(monthlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 34, -1));

        yearlbl.setText("YY'");
        jPanel3.add(yearlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 34, -1));

        cvvlbl.setText("CVV/CVWW");
        jPanel3.add(cvvlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 70, -1));

        CvvTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CvvTxtFieldKeyReleased(evt);
            }
        });
        jPanel3.add(CvvTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 60, 20));

        cardNbrTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNbrTxtFieldActionPerformed(evt);
            }
        });
        cardNbrTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cardNbrTxtFieldKeyReleased(evt);
            }
        });
        jPanel3.add(cardNbrTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 290, 30));

        lastNamelbl.setText("Last Name");
        jPanel3.add(lastNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 64, -1));

        firstNameTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTxtFieldKeyReleased(evt);
            }
        });
        jPanel3.add(firstNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 290, 34));

        firstNamelbl.setText("First Name ");
        jPanel3.add(firstNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 64, -1));

        LastNameTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LastNameTxtFieldKeyReleased(evt);
            }
        });
        jPanel3.add(LastNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 34));

        cardYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cardYearComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, 20));

        genderButtons.add(maleButton);
        maleButton.setText("male");
        jPanel3.add(maleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        addCardButton.setText("add card");
        addCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCardButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addCardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 170, 30));
        jPanel3.add(errorlbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 190, 30));

        IdNumlbl.setText("ID Number");
        jPanel3.add(IdNumlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 64, -1));

        IdNumTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdNumTxtFieldActionPerformed(evt);
            }
        });
        IdNumTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IdNumTxtFieldKeyReleased(evt);
            }
        });
        jPanel3.add(IdNumTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 290, 34));
        jPanel3.add(errorlbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 180, 30));

        genderButtons.add(femaleButton);
        femaleButton.setText("female");
        jPanel3.add(femaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        cardMonthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cardMonthCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 20));

        errorlbl2.setText("\n");
        jPanel3.add(errorlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 70, 20));
        jPanel3.add(errorlbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 200, 30));
        jPanel3.add(errorlbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 190, 30));
        jPanel3.add(errorlbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 190, 30));
        jPanel3.add(errorlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 190, 30));

        jTabbedPane1.addTab("payment methods", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardNbrTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNbrTxtFieldActionPerformed

    }//GEN-LAST:event_cardNbrTxtFieldActionPerformed

    private void addCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCardButtonActionPerformed

        //check date
        String yearStr = (String) cardYearComboBox.getSelectedItem();
        int date = Integer.parseInt(yearStr);

        if (!v.checkExpirationDate(date)) {
            expirationVal = false;
            errorlbl2.setText("Invalid expiration date");
        } else {
            expirationVal = true;
            errorlbl2.setText(" ");

        }

        // check gender from ID num - range check
        String idNumStr = IdNumTxtField.getText();
        boolean female = femaleButton.isSelected();
        boolean male = maleButton.isSelected();

        if (v.checkGenderfromId(idNumStr) == true) {
            if (female == true) {
                genderVal = true;
            } else {
                errorlbl6.setText("Gender does not match ID number");
                genderVal = false;
            }

        }

        if (v.checkGenderfromId(idNumStr) == false) {
            if (male == true) {
                genderVal = true;
            } else {
                errorlbl6.setText("Gender does not match ID number");
                genderVal = false;
            }

        }
        //check if all  validations are checked
        if (cardNumVal && firstNameVal && cvvVal && lastNameVal && expirationVal && idNumVal && genderVal) {
            JOptionPane.showMessageDialog(rootPane, "form successfully completed");

        } else {
            JOptionPane.showMessageDialog(rootPane, "form not completed");
        }


    }//GEN-LAST:event_addCardButtonActionPerformed

    private void IdNumTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdNumTxtFieldActionPerformed

    }//GEN-LAST:event_IdNumTxtFieldActionPerformed

    private void firstNameTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTxtFieldKeyReleased
        String firstNameStr = firstNameTxtField.getText();
        if (!v.PresenceCheck(firstNameStr)) {
            firstNameVal = false;
            errorlbl4.setText("name is required");
        } else if (!v.checkForLetters(firstNameStr)) {
            firstNameVal = false;
            errorlbl4.setText("name cannot contain numbers");
        } else {
            firstNameVal = true;
            errorlbl4.setText(" ");
        }

    }//GEN-LAST:event_firstNameTxtFieldKeyReleased

    private void cardNbrTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardNbrTxtFieldKeyReleased
        String cardNumStr = cardNbrTxtField.getText();
        if (!v.PresenceCheck(cardNumStr)) {
            cardNumVal = false;
            errorlbl1.setText("card number is required");
        } else if (!v.checkForDigits(cardNumStr)) {
            cardNumVal = false;
            errorlbl1.setText("card number requires digits only");

        } else if (!v.checkCardLength(cardNumStr)) {
            cardNumVal = false;
            errorlbl1.setText("card number needs to be 16 digits long");
        } else {
            cardNumVal = true;
            errorlbl1.setText(" ");

        }

    }//GEN-LAST:event_cardNbrTxtFieldKeyReleased

    private void CvvTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CvvTxtFieldKeyReleased
        String cvvNumStr = CvvTxtField.getText();
        if (!v.PresenceCheck(cvvNumStr)) {
            cvvVal = false;
            errorlbl3.setText("cvv required");
        } else if (!v.checkForDigits(cvvNumStr)) {
            cvvVal = false;
            errorlbl3.setText("cvv can only have digits");
        } else if (!v.checkCVV(cvvNumStr)) {
            cvvVal = false;
            errorlbl3.setText("cvv must be 3 digits long");
        } else {
            cvvVal = true;
            errorlbl3.setText(" ");
        }

    }//GEN-LAST:event_CvvTxtFieldKeyReleased

    private void LastNameTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameTxtFieldKeyReleased
        String lastNameStr = LastNameTxtField.getText();
        if (!v.PresenceCheck(lastNameStr)) {
            lastNameVal = false;
            errorlbl5.setText("surname is required");
        } else if (!v.checkForLetters(lastNameStr)) {
            lastNameVal = false;
            errorlbl5.setText("surname cannot contain numbers");
        } else {
            lastNameVal = true;
            errorlbl5.setText(" ");
        }
    }//GEN-LAST:event_LastNameTxtFieldKeyReleased

    private void IdNumTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdNumTxtFieldKeyReleased
        String idNumStr = IdNumTxtField.getText();
        if (!v.PresenceCheck(idNumStr)) {
            idNumVal = false;
            errorlbl6.setText("id number required");
        } else if (!v.checkForDigits(idNumStr)) {
            idNumVal = false;
            errorlbl6.setText("id number cannot contain letters");
        } else if (!v.checkIdLength(idNumStr)) {
            idNumVal = false;
            errorlbl6.setText("id number but be 13 digits");
        } else {
            idNumVal = true;
            errorlbl6.setText(" ");
        }

    }//GEN-LAST:event_IdNumTxtFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CardNbrLbl;
    private javax.swing.JTextField CvvTxtField;
    private javax.swing.JTextField IdNumTxtField;
    private javax.swing.JLabel IdNumlbl;
    private javax.swing.JDialog JPaneBox;
    private javax.swing.JTextField LastNameTxtField;
    private javax.swing.JLabel PayPalLbl;
    private javax.swing.JButton addCardButton;
    private javax.swing.JComboBox<String> cardMonthCombo;
    private javax.swing.JTextField cardNbrTxtField;
    private javax.swing.JComboBox<String> cardYearComboBox;
    private javax.swing.JLabel cvvlbl;
    private javax.swing.JLabel errorlbl1;
    private javax.swing.JLabel errorlbl2;
    private javax.swing.JLabel errorlbl3;
    private javax.swing.JLabel errorlbl4;
    private javax.swing.JLabel errorlbl5;
    private javax.swing.JLabel errorlbl6;
    private javax.swing.JLabel errorlbl7;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField firstNameTxtField;
    private javax.swing.JLabel firstNamelbl;
    private javax.swing.ButtonGroup genderButtons;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lastNamelbl;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel monthlbl;
    private javax.swing.JLabel yearlbl;
    // End of variables declaration//GEN-END:variables
}
