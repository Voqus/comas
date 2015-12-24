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
        compAddressLabel = new javax.swing.JLabel();
        compNameTextfield = new javax.swing.JTextField();
        compTaxOfficeTextfield = new javax.swing.JTextField();
        compAddressTextfield = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Στοιχεία Εταιρείας");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Στοιχεία Εταιρείας");

        compNameLabel.setText("Όνομα:");

        compTaxOfficeLabel.setText("Δ.Ο.Υ:");

        compAddressLabel.setText("Έδρα:");

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
                .addGap(76, 76, 76)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblTitle))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(compTaxOfficeLabel)
                            .addComponent(compNameLabel)
                            .addComponent(compAddressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(compNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compTaxOfficeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compAddressTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(confirmButton)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(39, 39, 39)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compNameLabel)
                    .addComponent(compNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compTaxOfficeLabel)
                    .addComponent(compTaxOfficeTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compAddressLabel)
                    .addComponent(compAddressTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
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
        String compName         = compNameTextfield.getText();
        String compTaxOffice    = compTaxOfficeTextfield.getText();
        String compAddress      = compAddressTextfield.getText();
        
        // Validation check for empty fields
        if((compName.isEmpty()) || (compTaxOffice.isEmpty()) || (compAddress.isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε όλα τα πεδία", "", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try 
        {
            // Write down the information given from textfields to a file
            PrintWriter pw = new PrintWriter(file);
            pw.write(compName + "//");
            pw.write(compTaxOffice + "//");
            pw.write(compAddress);
            pw.close();
            
            Process process = Runtime.getRuntime().exec("attrib +h " + file);
            process.waitFor();
            
            setIsWindowActive(false);
            this.dispose();
        } 
        catch (IOException | InterruptedException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "FILE NOT FOUND ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(1);
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
    private javax.swing.JLabel compNameLabel;
    private javax.swing.JTextField compNameTextfield;
    private javax.swing.JLabel compTaxOfficeLabel;
    private javax.swing.JTextField compTaxOfficeTextfield;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
