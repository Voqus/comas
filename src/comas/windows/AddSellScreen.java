package comas.windows;

import comas.database.SellDatabase;
import javax.swing.JOptionPane;

public class AddSellScreen extends javax.swing.JFrame
{
    private static volatile AddSellScreen object;
    
    public static synchronized AddSellScreen getInstance()
    {
        if ( object == null )
            object = new AddSellScreen();
        
        return object;
    } // getInstance
    
    /**
     * Creates new form AddSellScreen
     */
    private AddSellScreen()
    {
        initComponents();

        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
    } // AddSellScreen

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
        productIdLabel = new javax.swing.JLabel();
        clientIdLabel = new javax.swing.JLabel();
        productStockLabel = new javax.swing.JLabel();
        productIdTextfield = new javax.swing.JTextField();
        clientIdTextfield = new javax.swing.JTextField();
        stockTextfield = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Καταχώριση Πώλησης");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Καταχώριση Πώλησης");

        productIdLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        productIdLabel.setText("ID προϊόντος:");

        clientIdLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        clientIdLabel.setText("ID πελάτη:");

        productStockLabel.setText("Τεμάχια:");

        productIdTextfield.setToolTipText("π.χ 1");

        clientIdTextfield.setToolTipText("π.χ 1");

        stockTextfield.setToolTipText("π.χ 1");

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
                .addGap(32, 32, 32)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clientIdLabel)
                            .addComponent(productIdLabel)
                            .addComponent(productStockLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productIdTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clientIdTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblTitle))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(confirmButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productIdLabel)
                    .addComponent(productIdTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientIdLabel)
                    .addComponent(clientIdTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productStockLabel)
                    .addComponent(stockTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addGap(50, 50, 50))
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

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if(productIdTextfield.getText().isEmpty() || stockTextfield.getText().isEmpty() || clientIdTextfield.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Παρακαλώ συμπληρώστε όλα τα πεδία", "Κενά πεδία", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        if(!(productIdTextfield.getText().matches("[0-9]*")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του ID του προϊόντος μπορεί να πάρει μόνο την μορφή ακεραίου."
                    + "</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        if(!(clientIdTextfield.getText().matches("[0-9]*")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο του ID του πελάτη μπορεί να πάρει μόνο την μορφή ακεραίου."
                    + "</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        if(!(stockTextfield.getText().matches("^[1-9]\\d*$")))
        {
            JOptionPane.showMessageDialog(this, "<html>Το πεδίο των τεμαχιών μπορούν να πάρουν την μορφή ακεραίου, εκτός του μηδενός."
                    + "</html>", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        } // if
        
        int productId   = Integer.parseInt(productIdTextfield.getText());
        int stock       = Integer.parseInt(stockTextfield.getText());
        int clientId    = Integer.parseInt(clientIdTextfield.getText());
        
        if(new SellDatabase().insertSell(productId, clientId, stock))
        {
            JOptionPane.showMessageDialog (this, "Η καταχώριση πώλησης καταχωρίθηκε με επιτυχία", "Επιτυχής Καταχώριση", JOptionPane.INFORMATION_MESSAGE);
            MainScreen.loadStorageTable();
            MainScreen.loadSellTable();
            MainScreen.loadDeskPane();
            this.dispose();
        } // if
        else
        {
            JOptionPane.showMessageDialog(this, "Δεν ήταν επιτυχής η καταχώριση παρακαλώ προσπαθήστε ξανά", "Ανεπιτυχής Καταχώριση", JOptionPane.ERROR_MESSAGE);
        } // else
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        object = null;
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel clientIdLabel;
    private javax.swing.JTextField clientIdTextfield;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel productIdLabel;
    private javax.swing.JTextField productIdTextfield;
    private javax.swing.JLabel productStockLabel;
    private javax.swing.JTextField stockTextfield;
    // End of variables declaration//GEN-END:variables
}
