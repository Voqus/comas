package comas.windows;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class BusinessScreen extends javax.swing.JFrame {

    private File file;
    private boolean isWindowActive;

    /**
     * Creates new form BusinessScreen
     * @param file
     * @param isWindowActive
     */
    public BusinessScreen(File file, boolean isWindowActive) {
        this.file = file;
        this.isWindowActive = isWindowActive;

        initComponents();

        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        compNameLabel = new javax.swing.JLabel();
        compTaxOfficeLabel = new javax.swing.JLabel();
        compTaxRegisterLabel = new javax.swing.JLabel();
        compTelephoneLabel = new javax.swing.JLabel();
        compFaxLabel = new javax.swing.JLabel();
        compCityLabel = new javax.swing.JLabel();
        compAddressLabel = new javax.swing.JLabel();
        compNameTextfield = new javax.swing.JTextField();
        compTaxOfficeTextfield = new javax.swing.JTextField();
        compTaxRegisterTextfield = new javax.swing.JTextField();
        compTelephoneTextfield = new javax.swing.JTextField();
        compFaxTextfield = new javax.swing.JTextField();
        compCityTextfield = new javax.swing.JTextField();
        compAddressTextfield = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Στοιχεία Εταιρείας");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Στοιχεία Εταιρείας");

        compNameLabel.setText("Όνομα Εταιρείας:");

        compTaxOfficeLabel.setText("Δ.Ο.Υ:");

        compTaxRegisterLabel.setText("Α.Φ.Μ:");

        compTelephoneLabel.setText("Τηλέφωνο:");

        compFaxLabel.setText("Φαξ:");

        compCityLabel.setText("Πόλη:");

        compAddressLabel.setText("Διεύθυνση:");

        confirmButton.setText("Ολοκλήρωση");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lblTitle))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(confirmButton))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(compTaxOfficeLabel)
                            .addComponent(compNameLabel)
                            .addComponent(compCityLabel)
                            .addComponent(compTaxRegisterLabel)
                            .addComponent(compAddressLabel)
                            .addComponent(compTelephoneLabel)
                            .addComponent(compFaxLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compTaxOfficeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compTaxRegisterTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compTelephoneTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compFaxTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compCityTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compAddressTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compNameLabel)
                    .addComponent(compNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compTaxOfficeLabel)
                    .addComponent(compTaxOfficeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compTaxRegisterLabel)
                    .addComponent(compTaxRegisterTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compTelephoneLabel)
                    .addComponent(compTelephoneTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compFaxLabel)
                    .addComponent(compFaxTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compCityLabel)
                    .addComponent(compCityTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compAddressLabel)
                    .addComponent(compAddressTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(confirmButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        Object[] options        = {"Ναι", "Όχι"};
        String compName         = compNameTextfield.getText();
        String compTaxOffice    = compTaxOfficeTextfield.getText();
        String compTaxRegister  = compTaxRegisterTextfield.getText();
        String compTelephone    = compTelephoneTextfield.getText();
        String compFax          = compFaxTextfield.getText();
        String compCity         = compCityTextfield.getText();
        String compAddress      = compAddressTextfield.getText();

        // Validation check for empty fields
        if ((compName.isEmpty()) || (compTaxOffice.isEmpty()) || (compTaxRegister.isEmpty()) || 
                (compTelephone.isEmpty()) || (compFax.isEmpty()) || (compCity.isEmpty()) || (compAddress.isEmpty())) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ συμπληρώστε όλα τα πεδία", "Κενά πεδία", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int answer = JOptionPane.showOptionDialog(this, "<html><center>Είστε σίγουροι ότι δώσατε τις σωστές πληροφορίες;<br/>"
                + "Δεν θα υπάρξει τρόπος επεξεργασίας των στοιχείων αυτών ξανά.</center></html>", "Επιβεβαίωση",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
        if (answer == JOptionPane.YES_OPTION) {
            try {
                // Write down the information given from textfields to a file
                PrintWriter pw = new PrintWriter(file);
                pw.write(compName + "//");
                pw.write(compTaxOffice + "//");
                pw.write(compTaxRegister + "//");
                pw.write(compTelephone + "//");
                pw.write(compFax + "//");
                pw.write(compCity + "//");
                pw.write(compAddress);
                pw.close();

                Process process = Runtime.getRuntime().exec("attrib +h " + file);
                process.waitFor();

                setIsWindowActive(false);
                this.dispose();
            } catch (IOException | InterruptedException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "FILE NOT FOUND ERROR", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                System.exit(1);
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    public boolean isWindowActive() {
        return isWindowActive;
    }

    public void setIsWindowActive(boolean isWindowActive) {
        this.isWindowActive = isWindowActive;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel compAddressLabel;
    private javax.swing.JTextField compAddressTextfield;
    private javax.swing.JLabel compCityLabel;
    private javax.swing.JTextField compCityTextfield;
    private javax.swing.JLabel compFaxLabel;
    private javax.swing.JTextField compFaxTextfield;
    private javax.swing.JLabel compNameLabel;
    private javax.swing.JTextField compNameTextfield;
    private javax.swing.JLabel compTaxOfficeLabel;
    private javax.swing.JTextField compTaxOfficeTextfield;
    private javax.swing.JLabel compTaxRegisterLabel;
    private javax.swing.JTextField compTaxRegisterTextfield;
    private javax.swing.JLabel compTelephoneLabel;
    private javax.swing.JTextField compTelephoneTextfield;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
