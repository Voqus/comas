package comas.windows;

import comas.base.Supplier;
import comas.database.SupplierDatabase;
import javax.swing.JOptionPane;

public class AddSupplierScreen extends javax.swing.JFrame {

    private static volatile AddSupplierScreen object;
    
    public static synchronized AddSupplierScreen getInstance()
    {
        if ( object == null )
            object = new AddSupplierScreen();
        
        return object;
    }
    
    /**
     * Creates new form AddSupplierScreen
     */
    private AddSupplierScreen() {
        initComponents();
        
        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
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
        setResizable(false);

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

        txtFirstName.setToolTipText("π.χ Νίκος");

        lblMsgLastName.setText("Επώνυμο:");

        txtLastName.setToolTipText("π.χ Παπαδόπουλος");

        lblMsgPhoneA.setText("Τηλέφωνο Α:");

        txtPhoneA.setToolTipText("π.χ 0030-0123456789");

        lblMsgPhoneB.setText("Τηλέφωνο Β:");

        txtPhoneB.setToolTipText("π.χ 0030-0123456789");

        lblMsgAddress.setText("Διέυθυνση:");

        lblMsgCity.setText("Πόλη:");

        txtAddress.setToolTipText("π.χ Μαρτίου 44");

        txtCity.setToolTipText("π.χ Αθήνα");

        lblMsgPostalCode.setText("Τ.Κ:");

        txtPostalCode.setToolTipText("π.χ 01234");

        lblMsgTaxReg.setText("Α.Φ.Μ.:");

        txtTaxReg.setToolTipText("π.χ GR0123456789 // Κωδικός χώρας + 8 με 10 ψηφία");

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
        if(txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtCity.getText().isEmpty()
                || txtPhoneA.getText().isEmpty() || txtPhoneB.getText().isEmpty() || txtPostalCode.getText().isEmpty() ||
                txtTaxReg.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Παρακαλώ συμπληρώστε όλα τα πεδία", "Κενά πεδία", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(txtFirstName.getText().matches("\\w[A-Za-z]*")) || !(txtLastName.getText().matches("\\w[A-Za-z]*")))
        {
            JOptionPane.showMessageDialog(this, "<html>Τα πεδία ονομάτων δεν μπορούν να περιέχουν αριθμούς.</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(txtPhoneA.getText().matches("[0-9]{4}-[0-9]{10}")) || !(txtPhoneB.getText().matches("[0-9]{4}-[0-9]{10}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του τηλεφώνου μπορεί να πάρει την μορφή : <b>0030-0123456789</b> .</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(txtPostalCode.getText().matches("[0-9]{5}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του ταχυδρομικού κώδικα πρέπει να περιέχει 5 αριθμούς.<br/>"
                    + "Π.χ 01234</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(txtTaxReg.getText().matches("[A-Z]{2}[0-9]{8,10}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του Α.Φ.Μ πρέπει να έχει την μορφή : <b>GR0123456789</b>.<br/>"
                    + "Οι αριθμοί μπορεί να είναι 8 εώς 10.</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Supplier supplier = new Supplier(txtFirstName.getText(),
                                         txtLastName.getText(),
                                         txtAddress.getText(),
                                         txtCity.getText(),
                                         txtPhoneA.getText(),
                                         txtPhoneB.getText(),
                                         txtPostalCode.getText(),
                                         txtTaxReg.getText());
       if(new SupplierDatabase().insertSupplier(supplier)){
          JOptionPane.showMessageDialog (this,
                                           "Τα στοιχεία καταχωρήθηκαν με επιτυχία",
                                           "Επιτυχής Καταχώριση",
                                           JOptionPane.INFORMATION_MESSAGE);
          MainScreen.loadSupplierTable();
          this.dispose();
        }else{
            JOptionPane.showMessageDialog (this,
                                           "Δεν ήταν επιτυχής η καταχώριση παρακαλώ προσπαθήστε ξανά",
                                           "Ανεπιτυχής Καταχώριση",
                                           JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
