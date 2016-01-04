package comas.windows;

import comas.base.Supplier;
import comas.database.SupplierDatabase;
import javax.swing.JOptionPane;

public class EditSupplierScreen extends javax.swing.JFrame
{
    private static volatile EditSupplierScreen object;
    private int supplierId;
    
    public static synchronized EditSupplierScreen getInstance(Supplier supplier, final int supplierId)
    {
        if ( object == null )
            object = new EditSupplierScreen(supplier, supplierId);
        
        return object;
    } // getInstance
    
    /**
     * Creates new form EditSupplierScreen
     */
    private EditSupplierScreen(Supplier supplier,final int supplierId) {
        initComponents();
        
        // Fill in the fields with the supplier's data
        this.supplierId = supplierId;
        firstnameField.setText(supplier.getFirstName());
        lastnameField.setText(supplier.getLastName());
        phoneAField.setText(supplier.getTelephoneA());
        phoneBField.setText(supplier.getTelephoneB());
        addressField.setText(supplier.getAddress());
        cityField.setText(supplier.getCity());
        postalCodeField.setText(supplier.getPostalCode());
        taxRegisterField.setText(supplier.getTaxRegister());
        
        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
    } // EditSupplierScreen

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        firstnameLabel = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        lastnameField = new javax.swing.JTextField();
        phoneALabel = new javax.swing.JLabel();
        phoneAField = new javax.swing.JTextField();
        phoneBLabel = new javax.swing.JLabel();
        phoneBField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        postalCodeLabel = new javax.swing.JLabel();
        postalCodeField = new javax.swing.JTextField();
        taxRegisterLabel = new javax.swing.JLabel();
        taxRegisterField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLabel.setText("Επεξεργασία Στοιχείων Προμηθευτή");

        saveButton.setText("Αποθήκευση");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Διαγραφή");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Κλείσιμο");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        firstnameLabel.setText("Όνομα:");

        firstnameField.setToolTipText("π.χ Νίκος");

        lastnameLabel.setText("Επώνυμο:");

        lastnameField.setToolTipText("π.χ Παπαδόπουλος");

        phoneALabel.setText("Τηλέφωνο Α:");

        phoneAField.setToolTipText("π.χ 0030-0123456789");

        phoneBLabel.setText("Τηλέφωνο Β:");

        phoneBField.setToolTipText("π.χ 0030-0123456789");

        addressLabel.setText("Διεύθυνση:");

        addressField.setToolTipText("π.χ Μαρτίου 44");

        cityLabel.setText("Πόλη:");

        cityField.setToolTipText("π.χ Αθήνα");

        postalCodeLabel.setText("Ταχ. Κώδικας:");

        postalCodeField.setToolTipText("π.χ 01234");

        taxRegisterLabel.setText("Α.Φ.Μ.:");

        taxRegisterField.setToolTipText("π.χ GR0123456789 // Κωδικός χώρας + 8 με 10 ψηφία");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(taxRegisterLabel)
                            .addComponent(postalCodeLabel))
                        .addGap(17, 17, 17))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(cityLabel)
                        .addGap(18, 18, 18))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneBLabel)
                            .addComponent(addressLabel)
                            .addComponent(phoneALabel)
                            .addComponent(lastnameLabel)
                            .addComponent(firstnameLabel))
                        .addGap(18, 18, 18)))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taxRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneBField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(postalCodeField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(cityField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(phoneAField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(lastnameField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addGap(49, 49, 49)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(23, 23, 23)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLabel)
                    .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel)
                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneALabel)
                    .addComponent(phoneAField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeLabel)
                    .addComponent(postalCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxRegisterLabel)
                    .addComponent(taxRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(deleteButton)
                    .addComponent(closeButton))
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

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
       this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Object[] options = {"Ναι", "Όχι"};
        // Confirmation message/input
        int selectedOption = JOptionPane.showOptionDialog(this,
                                                          "Είστε Σίγουροι για την διαγραφή του προμηθευτή με ID: "+supplierId,
                                                          "Επιβεβαίωση",
                                                          JOptionPane.YES_NO_OPTION,
                                                          JOptionPane.INFORMATION_MESSAGE,
                                                          null,
                                                          options,
                                                          options[1]);
        
        if (selectedOption == 0)
        { 
            if( new SupplierDatabase().deleteSupplier(supplierId))
            {
                MainScreen.loadSupplierTable();
                JOptionPane.showMessageDialog(this, "Η διαγραφή του προμηθευτή ολοκληρώθηκε επιτυχώς", "Επιτυχής Διαγραφή",JOptionPane.INFORMATION_MESSAGE);  
                this.dispose();
            } // if
            else
            {
                JOptionPane.showMessageDialog(this, "Ανεπιτυχείς διαγραφή προμηθευτή ", "Σφάλμα",JOptionPane.ERROR_MESSAGE);
            } // else
        } // if
        else
        {
          this.dispose();
        } // else
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(firstnameField.getText().isEmpty() || lastnameField.getText().isEmpty() || addressField.getText().isEmpty() || cityField.getText().isEmpty()
                || phoneAField.getText().isEmpty() || phoneBField.getText().isEmpty() || postalCodeField.getText().isEmpty() ||
                taxRegisterField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Παρακαλώ συμπληρώστε όλα τα πεδία", "Κενά πεδία", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        if(!(firstnameField.getText().matches("\\w[A-Za-z]*")) || !(lastnameField.getText().matches("\\w[A-Za-z]*")))
        {
            JOptionPane.showMessageDialog(this, "<html>Τα πεδία ονομάτων δεν μπορούν να περιέχουν αριθμούς.</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        if(!(phoneAField.getText().matches("[0-9]{4}-[0-9]{10}")) || !(phoneBField.getText().matches("[0-9]{4}-[0-9]{10}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Τα πεδία τηλεφώνων μπορούν να πάρουν να πάρει την μορφή : <b>0030-0123456789</b> .</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        if(!(postalCodeField.getText().matches("[0-9]{5}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του ταχυδρομικού κώδικα πρέπει να περιέχει 5 αριθμούς.<br/>"
                    + "Π.χ 01234</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        if(!(taxRegisterField.getText().matches("[A-Z]{2}[0-9]{8,10}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του Α.Φ.Μ πρέπει να έχει την μορφή : <b>GR0123456789</b>.<br/>"
                    + "Οι αριθμοί μπορεί να είναι 8 εώς 10.</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        
        // Create a supplier object to take in the changes given to fields to update the database.
        Supplier supplier = new Supplier(firstnameField.getText(),
                                         lastnameField.getText(),
                                         addressField.getText(),
                                         cityField.getText(),
                                         phoneAField.getText(),
                                         phoneBField.getText(),
                                         postalCodeField.getText(),
                                         taxRegisterField.getText());
        if (new SupplierDatabase().updateSupplier(supplier, supplierId))
        {
            JOptionPane.showMessageDialog(this,
                    "Τα στοιχεία ενημερώθηκαν με επιτυχία",
                    "Επιτυχείς Ενημέρωση",
                    JOptionPane.INFORMATION_MESSAGE);
            MainScreen.loadSupplierTable();
            this.dispose();
        } // if
        else
        {
            JOptionPane.showMessageDialog(this,
                    "Δεν ήταν επιτυχής η ενημέρωση παρακαλώ προσπαθήστε ξανά",
                    "Ανεπιτυχής Ενημέρωση",
                    JOptionPane.ERROR_MESSAGE);
        } // else
    }//GEN-LAST:event_saveButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        object = null;
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField phoneAField;
    private javax.swing.JLabel phoneALabel;
    private javax.swing.JTextField phoneBField;
    private javax.swing.JLabel phoneBLabel;
    private javax.swing.JTextField postalCodeField;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField taxRegisterField;
    private javax.swing.JLabel taxRegisterLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
