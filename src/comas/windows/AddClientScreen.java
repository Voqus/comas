package comas.windows;

import comas.base.Client;
import comas.database.ClientDatabase;
import javax.swing.JOptionPane;

public class AddClientScreen extends javax.swing.JFrame {

    private static volatile AddClientScreen object;
    
    public static synchronized AddClientScreen getInstance()
    {
        if(object == null)
            object = new AddClientScreen();
        return object;
    }
    
    /**
     * Creates new form AddClientScreen
     */
    private AddClientScreen() {
        initComponents();

        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        businessNameLabel = new javax.swing.JLabel();
        professionLabel = new javax.swing.JLabel();
        professionCodeLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        telephoneALabel = new javax.swing.JLabel();
        telephoneBLabel = new javax.swing.JLabel();
        faxLabel = new javax.swing.JLabel();
        postalCodeLabel = new javax.swing.JLabel();
        taxRegisterLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        businessNameField = new javax.swing.JTextField();
        professionField = new javax.swing.JTextField();
        professionCodeField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        telephoneAField = new javax.swing.JTextField();
        telephoneBField = new javax.swing.JTextField();
        faxField = new javax.swing.JTextField();
        postalCodeField = new javax.swing.JTextField();
        taxRegisterField = new javax.swing.JTextField();
        confirmLabel = new javax.swing.JButton();
        cancelLabel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Καταχώριση Πελάτη");
        setResizable(false);

        firstNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        firstNameLabel.setText("Όνομα:");

        lastNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lastNameLabel.setText("Επώνυμο:");

        businessNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        businessNameLabel.setText("Όνομα Επιχείρησης:");

        professionLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        professionLabel.setText("Επάγγελμα:");

        professionCodeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        professionCodeLabel.setText("Κωδικός Επαγγέλματος:");

        addressLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addressLabel.setText("Διεύθυνση:");

        cityLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cityLabel.setText("Πόλη:");

        telephoneALabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        telephoneALabel.setText("Τηλέφωνο Α:");

        telephoneBLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        telephoneBLabel.setText("Τηλέφωνο Β:");

        faxLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        faxLabel.setText("Φάξ:");

        postalCodeLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        postalCodeLabel.setText("Ταχ. Κωδικός:");

        taxRegisterLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        taxRegisterLabel.setText("Α.Φ.Μ:");

        firstNameField.setToolTipText("π.χ Νίκος");

        lastNameField.setToolTipText("π.χ Παπαδόπουλος");

        businessNameField.setToolTipText("π.χ Παπαδόπουλος Α.Ε");

        professionField.setToolTipText("π.χ Ελεύθερος Επαγγελματίας");

        professionCodeField.setToolTipText("π.χ 01234-01234");

        addressField.setToolTipText("π.χ Μαρτίου 44");

        cityField.setToolTipText("π.χ Αθήνα");

        telephoneAField.setToolTipText("π.χ 0030-0123456789");

        telephoneBField.setToolTipText("π.χ 0030-0123456789");

        faxField.setToolTipText("π.χ 0030-0123456789");

        postalCodeField.setToolTipText("π.χ 01234");

        taxRegisterField.setToolTipText("π.χ GR0123456789 // Κωδικός χώρας + 8 με 10 ψηφία");

        confirmLabel.setText("Επιβεβαίωση");
        confirmLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmLabelActionPerformed(evt);
            }
        });

        cancelLabel.setText("Άκυρο");
        cancelLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelLabelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Καταχώριση Στοιχείων Πελάτη");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(faxLabel)
                                .addGap(18, 18, 18)
                                .addComponent(faxField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(postalCodeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(postalCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telephoneBLabel)
                                .addGap(18, 18, 18)
                                .addComponent(telephoneBField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telephoneALabel)
                                .addGap(18, 18, 18)
                                .addComponent(telephoneAField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cityLabel)
                                .addGap(18, 18, 18)
                                .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressLabel)
                                .addGap(18, 18, 18)
                                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(professionCodeLabel)
                                    .addComponent(professionLabel)
                                    .addComponent(businessNameLabel)
                                    .addComponent(lastNameLabel)
                                    .addComponent(firstNameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(businessNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(professionField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(professionCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(taxRegisterLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(confirmLabel)
                                        .addGap(38, 38, 38)
                                        .addComponent(cancelLabel))
                                    .addComponent(taxRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(businessNameLabel)
                    .addComponent(businessNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professionLabel)
                    .addComponent(professionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professionCodeLabel)
                    .addComponent(professionCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneALabel)
                    .addComponent(telephoneAField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneBLabel)
                    .addComponent(telephoneBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faxLabel)
                    .addComponent(faxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeLabel)
                    .addComponent(postalCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxRegisterLabel)
                    .addComponent(taxRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmLabel)
                    .addComponent(cancelLabel))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelLabelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelLabelActionPerformed

    // Saves Clients Data to Database {Returns message on jOptionPane}
    private void confirmLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmLabelActionPerformed
        if(businessNameField.getText().isEmpty() || firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || professionField.getText().isEmpty()
                || addressField.getText().isEmpty() || cityField.getText().isEmpty() || telephoneAField.getText().isEmpty() || telephoneBField.getText().isEmpty()
                || faxField.getText().isEmpty() || postalCodeField.getText().isEmpty() || taxRegisterField.getText().isEmpty() || professionCodeField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Παρακαλώ συμπληρώστε όλα τα πεδία", "Κενά πεδία", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(firstNameField.getText().matches("\\w[A-Za-z]*")) || !(lastNameField.getText().matches("\\w[A-Za-z]*")))
        {
            JOptionPane.showMessageDialog(this, "<html>Τα πεδία ονομάτων δεν μπορούν να περιέχουν αριθμούς.</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(professionCodeField.getText().matches("[0-9]{5}\\-[0-9]{5}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του κωδικού επαγγέλματος πρέπει να περιέχει μόνο αριθμούς "
                    + "και να έχει την μορφή: <b>012345-012345</b></html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(telephoneAField.getText().matches("[0-9]{4}-[0-9]{10}")) || !(telephoneBField.getText().matches("[0-9]{4}-[0-9]{10}")) 
                || !(faxField.getText().matches("[0-9]{4}-[0-9]{10}|-")))
        {
            JOptionPane.showMessageDialog(this, "<html>Τα πεδία τηλεφώνων μπορούν να πάρουν την μορφή : <b>0030-0123456789</b> .</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(postalCodeField.getText().matches("[0-9]{5}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του ταχυδρομικού κώδικα πρέπει να περιέχει 5 αριθμούς.<br/>"
                    + "Π.χ 01234</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(taxRegisterField.getText().matches("[A-Z]{2}[0-9]{8,10}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του Α.Φ.Μ πρέπει να έχει την μορφή : <b>GR0123456789</b>.<br/>"
                    + "Οι αριθμοί μπορεί να είναι 8 εώς 10.</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Client client = new Client(businessNameField.getText(),
                firstNameField.getText(),
                lastNameField.getText(),
                professionField.getText(),
                addressField.getText(),
                cityField.getText(),
                telephoneAField.getText(),
                telephoneBField.getText(),
                faxField.getText(),
                postalCodeField.getText(),
                taxRegisterField.getText(),
                professionCodeField.getText());

        // Inserts Data to Database and gives a JOptionPane for message
        if (new ClientDatabase().insertClient(client)) {
            JOptionPane.showMessageDialog(null,
                    "Τα στοιχεία καταχωρήθηκαν με επιτυχία",
                    "Επιτυχής Καταχώριση",
                    JOptionPane.INFORMATION_MESSAGE);
            MainScreen.loadClientTable();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Δεν ήταν επιτυχής η καταχώριση παρακαλώ προσπαθήστε ξανά",
                    "Ανεπιτυχής Καταχώριση",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmLabelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField businessNameField;
    private javax.swing.JLabel businessNameLabel;
    private javax.swing.JButton cancelLabel;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton confirmLabel;
    private javax.swing.JTextField faxField;
    private javax.swing.JLabel faxLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField postalCodeField;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JTextField professionCodeField;
    private javax.swing.JLabel professionCodeLabel;
    private javax.swing.JTextField professionField;
    private javax.swing.JLabel professionLabel;
    private javax.swing.JTextField taxRegisterField;
    private javax.swing.JLabel taxRegisterLabel;
    private javax.swing.JTextField telephoneAField;
    private javax.swing.JLabel telephoneALabel;
    private javax.swing.JTextField telephoneBField;
    private javax.swing.JLabel telephoneBLabel;
    // End of variables declaration//GEN-END:variables
}
