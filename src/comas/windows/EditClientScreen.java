package comas.windows;

import comas.base.Client;
import comas.database.ClientDatabase;
import javax.swing.JOptionPane;

public class EditClientScreen extends javax.swing.JFrame
{
    private static volatile EditClientScreen object;
    private int clientId;
    
    public static synchronized EditClientScreen getInstance(Client client, final int clientId)
    {
        if ( object == null )
            object = new EditClientScreen(client, clientId);
        
        return object;
    } // getInstance

    /**
     * Creates new form EditClientScreen
     *
     * @param client
     * @param clientId
     */
    private EditClientScreen(Client client, final int clientId) {
        initComponents();

        // Fill in the fields with the client's data
        this.clientId = clientId;
        businessNameField.setText(client.getBusinessName());
        firstNameField.setText(client.getFirstName());
        lastNameField.setText(client.getLastName());
        professionField.setText(client.getProfession());
        addressField.setText(client.getAddress());
        cityField.setText(client.getCity());
        telephoneAField.setText(client.getTelephoneA());
        telephoneBField.setText(client.getTelephoneB());
        faxField.setText(client.getFax());
        postalCodeField.setText(client.getPostalCode());
        taxRegisterField.setText(client.getTaxRegister());
        professionCodeField.setText(client.getProfessionCode());
        
        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
    } // EditClientScreen

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        editClientLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Επεξεργασία Στοιχείων Πελάτη");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

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

        firstNameField.setToolTipText("π.χ Nikos");

        lastNameField.setToolTipText("π.χ Papadopoulos");

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

        confirmButton.setText("Επιβεβαίωση");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Άκυρο");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        editClientLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editClientLabel.setText("Επεξεργασία Στοιχείων Πελάτη");

        deleteButton.setText("Διαγραφή");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(editClientLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(taxRegisterLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(faxLabel)
                                .addGap(18, 18, 18)
                                .addComponent(faxField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(taxRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(postalCodeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(postalCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(editClientLabel)
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
                    .addComponent(cancelButton)
                    .addComponent(confirmButton)
                    .addComponent(deleteButton))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if(businessNameField.getText().isEmpty() || firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || professionField.getText().isEmpty()
                || addressField.getText().isEmpty() || cityField.getText().isEmpty() || telephoneAField.getText().isEmpty() || telephoneBField.getText().isEmpty()
                || faxField.getText().isEmpty() || postalCodeField.getText().isEmpty() || taxRegisterField.getText().isEmpty() || professionCodeField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Παρακαλώ συμπληρώστε όλα τα πεδία", "Κενά πεδία", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        if(!(firstNameField.getText().matches("\\w[A-Za-z]+")) || !(lastNameField.getText().matches("\\w[A-Za-z]+")))
        {
            JOptionPane.showMessageDialog(this, "<html>Τα πεδία ονομάτων δεν μπορούν να περιέχουν κενά, αριθμούς, σύμβολα ή ελληνικούς χαρακτήρες. Μπορούν "
                    + "να πάρουν την μορφή: <b>Nikos</b>, <b>Papadopoulos</b></html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        if(!(telephoneAField.getText().matches("[0-9]{4}-[0-9]{10}")) || !(telephoneBField.getText().matches("[0-9]{4}-[0-9]{10}")) 
                || !(faxField.getText().matches("[0-9]{4}-[0-9]{10}|-")))
        {
            JOptionPane.showMessageDialog(this, "<html>Τα πεδία τηλεφώνων μπορούν να πάρουν την μορφή : <b>0030-0123456789</b> .</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
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
        if(!(professionCodeField.getText().matches("[0-9]{5}\\-[0-9]{5}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του κωδικού επαγγέλματος πρέπει να περιέχει μόνο αριθμούς "
                    + "και να έχει την μορφή: <b>012345-012345</b></html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        
        // Create a client object to take in the changes given to fields to update the database.
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
        if (new ClientDatabase().updateClient(client, clientId))
        {
            JOptionPane.showMessageDialog(null,
                    "Τα στοιχεία καταχωρήθηκαν με επιτυχία",
                    "Επιτυχής Καταχώριση",
                    JOptionPane.INFORMATION_MESSAGE);
            MainScreen.loadClientTable();
            this.dispose();
        } // if
        else
        {
            JOptionPane.showMessageDialog(null,
                    "Δεν ήταν επιτυχής η καταχώριση παρακαλώ προσπαθήστε ξανά",
                    "Ανεπιτυχής Καταχώριση",
                    JOptionPane.ERROR_MESSAGE);
        } // else
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        Object[] options = {"Ναι", "Όχι"};
        // Confirmation message/input
        int selectedOption = JOptionPane.showOptionDialog(this, "Είστε σίγουροι για την διαγραφή του πελάτη με ID: "+clientId,
                             "Επιβεβαίωση", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                             null,options,options[1]);
        
        if (selectedOption == 0)
        {
            if(new ClientDatabase().deleteClient(clientId))
            {
                MainScreen.loadClientTable();
                JOptionPane.showMessageDialog(this, "Η διαγραφή του πελάτη ολοκληρώθηκε επιτυχώς", "Επιτυχής Διαγραφή",JOptionPane.INFORMATION_MESSAGE);  
                this.dispose();
            } // if
            else
            {
                JOptionPane.showMessageDialog(this, "Ανεπιτυχής διαγραφή πελάτη ", "Σφάλμα",JOptionPane.ERROR_MESSAGE);
            } // else
        } // if
        else
        {
          this.dispose();
        } // else
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        object = null;
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField businessNameField;
    private javax.swing.JLabel businessNameLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel editClientLabel;
    private javax.swing.JTextField faxField;
    private javax.swing.JLabel faxLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
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
