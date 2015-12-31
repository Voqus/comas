package comas.windows;

import comas.base.Product;
import comas.database.PurchaseDatabase;
import javax.swing.JOptionPane;

public class AddPurchaseScreen extends javax.swing.JFrame {

    private static volatile AddPurchaseScreen object;
    
    public static synchronized AddPurchaseScreen getInstance()
    {
        if (object == null)
            object = new AddPurchaseScreen();
        
        return object;
    }
    /**
     * Creates new form AddPurchaseScreen
     */
    private AddPurchaseScreen() {
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

        mainPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        productDescLabel = new javax.swing.JLabel();
        measurementUnitLabel = new javax.swing.JLabel();
        productWeightLabel = new javax.swing.JLabel();
        productPurchPriceLabel = new javax.swing.JLabel();
        productSellPriceLabel = new javax.swing.JLabel();
        productStockLabel = new javax.swing.JLabel();
        supplierIdLabel = new javax.swing.JLabel();
        pNameTextfield = new javax.swing.JTextField();
        pDescTextfield = new javax.swing.JTextField();
        mUnitTextfield = new javax.swing.JTextField();
        pWeightTextfield = new javax.swing.JTextField();
        pPurchPriceTextfield = new javax.swing.JTextField();
        pSellPriceTextfield = new javax.swing.JTextField();
        pStockTextfield = new javax.swing.JTextField();
        supplierIdTextfield = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Καταχώριση Αγοράς");
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Καταχώριση Αγοράς");

        productNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productNameLabel.setText("Όνομα προϊόντος:");

        productDescLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productDescLabel.setText("Περιγραφή προϊόντος:");

        measurementUnitLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        measurementUnitLabel.setText("Μονάδα μέτρησης:");

        productWeightLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productWeightLabel.setText("Βάρος:");

        productPurchPriceLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productPurchPriceLabel.setText("Λειανική τιμή:");

        productSellPriceLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productSellPriceLabel.setText("Τιμή πώλησης:");

        productStockLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productStockLabel.setText("Τεμάχια:");

        supplierIdLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        supplierIdLabel.setText("ID προμηθευτή:");

        pNameTextfield.setToolTipText("π.χ Προϊόν 1");

        pDescTextfield.setToolTipText("π.χ υπολογιστές");

        mUnitTextfield.setToolTipText("π.χ Kg/K/g/T");

        pWeightTextfield.setToolTipText("π.χ 50.40");

        pPurchPriceTextfield.setToolTipText("π.χ 114.40");

        pSellPriceTextfield.setToolTipText("π.χ 123.45");

        pStockTextfield.setToolTipText("π.χ 99");

        supplierIdTextfield.setToolTipText("π.χ 1");

        confirmButton.setText("Επιβεβαίωση");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Ακύρωση");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblTitle))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(productDescLabel)
                            .addComponent(productNameLabel)
                            .addComponent(measurementUnitLabel)
                            .addComponent(productWeightLabel)
                            .addComponent(productPurchPriceLabel)
                            .addComponent(productSellPriceLabel)
                            .addComponent(productStockLabel)
                            .addComponent(supplierIdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pDescTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mUnitTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pPurchPriceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pSellPriceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pStockTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pWeightTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supplierIdTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(confirmButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelButton)))))
                .addGap(83, 83, 83))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameLabel)
                    .addComponent(pNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productDescLabel)
                    .addComponent(pDescTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(measurementUnitLabel)
                    .addComponent(mUnitTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productWeightLabel)
                    .addComponent(pWeightTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productPurchPriceLabel)
                    .addComponent(pPurchPriceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productSellPriceLabel)
                    .addComponent(pSellPriceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productStockLabel)
                    .addComponent(pStockTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplierIdLabel)
                    .addComponent(supplierIdTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if(pNameTextfield.getText().isEmpty() || pDescTextfield.getText().isEmpty() || mUnitTextfield.getText().isEmpty() || pWeightTextfield.getText().isEmpty()
                || pPurchPriceTextfield.getText().isEmpty() || pSellPriceTextfield.getText().isEmpty() || pStockTextfield.getText().isEmpty() || supplierIdTextfield.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Παρακαλώ συμπληρώστε όλα τα πεδία", "Κενά πεδία", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(mUnitTextfield.getText().matches("\\w[A-Za-z]{0,1}")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο της μονάδας μέτρησης μπορεί να πάρει την μορφή : <b>K</b>, "
                    + "<b>Kg</b>, <b>G</b>, <b>T</b>.</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(pWeightTextfield.getText().matches("[0-9]+.[0-9]+")) || !(pPurchPriceTextfield.getText().matches("[0-9]+.[0-9]+"))
                || !(pSellPriceTextfield.getText().matches("[0-9]+.[0-9]+")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του βάρους, και των τιμών μπορούν να πάρουν την μορφή : "
                    + "<b>50.430</b>. Ακόμα και εάν είναι στρογγυλό ποσό π.χ 50 κιλά, πρέπει να γραφτεί 50.0</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(pStockTextfield.getText().matches("^[1-9]\\d*$")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο των τεμαχιών μπορούν να πάρουν την μορφή ακεραίου, εκτός του μηδενός."
                    + "</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!(supplierIdTextfield.getText().matches("[0-9]*")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του ID του προμηθευτή μπορεί να πάρει μόνο την μορφή ακεραίου."
                    + "</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Product product = new Product(pNameTextfield.getText(), pDescTextfield.getText(), mUnitTextfield.getText(),
                Float.parseFloat(pWeightTextfield.getText()), Float.parseFloat(pPurchPriceTextfield.getText()),
                Float.parseFloat(pSellPriceTextfield.getText()), Integer.parseInt(pStockTextfield.getText()));
        
        int supplierId = Integer.parseInt(supplierIdTextfield.getText());

        
        if (new PurchaseDatabase().insertPurchase(product,supplierId)) {
            JOptionPane.showMessageDialog(this, "Η καταχώριση αγοράς καταχωρίθηκε με επιτυχία",
                    "Επιτυχής Καταχώριση",
                    JOptionPane.INFORMATION_MESSAGE);
            MainScreen.loadStorageTable();
            MainScreen.loadPurchaseTable();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Δεν ήταν επιτυχής η καταχώριση παρακαλώ προσπαθήστε ξανά",
                    "Ανεπιτυχής Καταχώριση",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField mUnitTextfield;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel measurementUnitLabel;
    private javax.swing.JTextField pDescTextfield;
    private javax.swing.JTextField pNameTextfield;
    private javax.swing.JTextField pPurchPriceTextfield;
    private javax.swing.JTextField pSellPriceTextfield;
    private javax.swing.JTextField pStockTextfield;
    private javax.swing.JTextField pWeightTextfield;
    private javax.swing.JLabel productDescLabel;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JLabel productPurchPriceLabel;
    private javax.swing.JLabel productSellPriceLabel;
    private javax.swing.JLabel productStockLabel;
    private javax.swing.JLabel productWeightLabel;
    private javax.swing.JLabel supplierIdLabel;
    private javax.swing.JTextField supplierIdTextfield;
    // End of variables declaration//GEN-END:variables
}
