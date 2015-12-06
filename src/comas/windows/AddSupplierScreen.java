package comas.windows;

import comas.base.Supplier;
import comas.database.SupplierDatabase;
import javax.swing.JOptionPane;

public class AddSupplierScreen extends javax.swing.JFrame {

    /**
     * Creates new form AddSupplierScreen
     */
    public AddSupplierScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblMsgName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblMsgLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblMsgPhoneA = new javax.swing.JLabel();
        txtPhoneA = new javax.swing.JTextField();
        lblMsgPhoneB = new javax.swing.JLabel();
        txtPhoneB = new javax.swing.JTextField();
        lblMsgAddress = new javax.swing.JLabel();
        lblMsgCity = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblMsgPostalCode = new javax.swing.JLabel();
        txtPostalCode = new javax.swing.JTextField();
        lblMsgTaxReg = new javax.swing.JLabel();
        txtTaxReg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Καταχώριση Προμηθευτή");

        btnClose.setText("Άκυρο");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSave.setText("Επιβεβαίωση");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Καταχώριση Προμηθευτή");

        lblMsgName.setText("Όνομα:");

        lblMsgLastName.setText("Επώνυμο:");

        lblMsgPhoneA.setText("Τηλέφωνο Α:");

        lblMsgPhoneB.setText("Τηλέφωνο Β:");

        lblMsgAddress.setText("Διέυθυνση:");

        lblMsgCity.setText("Πόλη:");

        lblMsgPostalCode.setText("Τ.Κ:");

        lblMsgTaxReg.setText("Α.Φ.Μ.:");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblTitle))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMsgTaxReg)
                            .addComponent(lblMsgCity)
                            .addComponent(lblMsgAddress)
                            .addComponent(lblMsgPhoneB)
                            .addComponent(lblMsgPhoneA)
                            .addComponent(lblMsgLastName)
                            .addComponent(lblMsgName)
                            .addComponent(lblMsgPostalCode))
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPostalCode)
                            .addComponent(txtLastName)
                            .addComponent(txtFirstName)
                            .addComponent(txtPhoneA)
                            .addComponent(txtPhoneB)
                            .addComponent(txtAddress)
                            .addComponent(txtCity)
                            .addComponent(txtTaxReg, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClose)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(24, 24, 24)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgPhoneA)
                    .addComponent(txtPhoneA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMsgPhoneB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgPostalCode)
                    .addComponent(txtPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgTaxReg)
                    .addComponent(txtTaxReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Supplier supplier = new Supplier(txtFirstName.getText(),
                                         txtLastName.getText(),
                                         txtAddress.getText(),
                                         txtCity.getText(),
                                         txtPhoneA.getText(),
                                         txtPhoneB.getText(),
                                         txtPostalCode.getText(),
                                         txtTaxReg.getText());
       if(new SupplierDatabase().insertSupplier(supplier)){
          JOptionPane.showMessageDialog (null,
                                           "Τα στοιχεία καταχωρήθηκαν με επιτυχία",
                                           "Επιτυχείς Καταχώριση",
                                           JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog (null,
                                           "Δεν ήταν επιτυχής η καταχώριση παρακαλώ προσπαθήστε ξανά",
                                           "Ανεπιτυχής Καταχώριση",
                                           JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(AddSupplierScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSupplierScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSupplierScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSupplierScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupplierScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblMsgAddress;
    private javax.swing.JLabel lblMsgCity;
    private javax.swing.JLabel lblMsgLastName;
    private javax.swing.JLabel lblMsgName;
    private javax.swing.JLabel lblMsgPhoneA;
    private javax.swing.JLabel lblMsgPhoneB;
    private javax.swing.JLabel lblMsgPostalCode;
    private javax.swing.JLabel lblMsgTaxReg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneA;
    private javax.swing.JTextField txtPhoneB;
    private javax.swing.JTextField txtPostalCode;
    private javax.swing.JTextField txtTaxReg;
    // End of variables declaration//GEN-END:variables
}