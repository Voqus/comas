package comas.windows;

import comas.database.ClientDatabase;
import javax.swing.table.DefaultTableModel;

public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        loadTable();
        
        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
    }

    private void loadTable() {

        final String QUERY = "SELECT * FROM Clients";
        ClientDatabase database = new ClientDatabase();
        database.connect();

        DefaultTableModel dtm = (DefaultTableModel) database.selectTable(QUERY);
        clientTable.setModel(dtm);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainTabbedPane = new javax.swing.JTabbedPane();
        clientPane = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        supplierPane = new javax.swing.JTabbedPane();
        storagePane = new javax.swing.JTabbedPane();
        sellsPane = new javax.swing.JTabbedPane();
        marketPane = new javax.swing.JTabbedPane();
        cashDeskPane = new javax.swing.JTabbedPane();
        menuBar = new javax.swing.JMenuBar();
        programMenu = new javax.swing.JMenu();
        restartMenuItem = new javax.swing.JMenuItem();
        programMenuSeparator = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        clientMenu = new javax.swing.JMenu();
        insertClientMenuItem = new javax.swing.JMenuItem();
        editClientMenuItem = new javax.swing.JMenuItem();
        deleteClientMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpProgramMenuItem = new javax.swing.JMenuItem();
        helpMenuSeparator = new javax.swing.JPopupMenu.Separator();
        contactMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ΛΕΔ: Λογισμικό Εμπορικής Διαχείρησης");
        setMinimumSize(new java.awt.Dimension(800, 504));
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(520, 504));

        mainTabbedPane.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        clientTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        clientTable.setEditingColumn(1);
        clientTable.setEditingRow(1);
        clientPane.setViewportView(clientTable);

        mainTabbedPane.addTab("Πελατολόγιο", clientPane);
        mainTabbedPane.addTab("Προμηθευτές", supplierPane);
        mainTabbedPane.addTab("Αποθήκη", storagePane);
        mainTabbedPane.addTab("Πωλήσεις", sellsPane);
        mainTabbedPane.addTab("Αγορές", marketPane);
        mainTabbedPane.addTab("Οικονομική Διαχείρηση", cashDeskPane);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
        );

        programMenu.setText("Πρόγραμμα");

        restartMenuItem.setText("Επανεκκίνηση");
        programMenu.add(restartMenuItem);
        programMenu.add(programMenuSeparator);

        exitMenuItem.setText("Έξοδος");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        programMenu.add(exitMenuItem);

        menuBar.add(programMenu);

        clientMenu.setText("Πελατολόγιο");

        insertClientMenuItem.setText("Εισαγωγή Πελάτη");
        insertClientMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertClientMenuItemActionPerformed(evt);
            }
        });
        clientMenu.add(insertClientMenuItem);

        editClientMenuItem.setText("Επεξεργασία Πελάτη");
        clientMenu.add(editClientMenuItem);

        deleteClientMenuItem.setText("Διαγραφή Πελάτη");
        clientMenu.add(deleteClientMenuItem);

        menuBar.add(clientMenu);

        helpMenu.setText("Βοήθεια");

        helpProgramMenuItem.setText("Χειρισμός Προγράμματος");
        helpMenu.add(helpProgramMenuItem);
        helpMenu.add(helpMenuSeparator);

        contactMenuItem.setText("Επικοινωνία");
        helpMenu.add(contactMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

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

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // Τερματισμός προγράμματος
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void insertClientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertClientMenuItemActionPerformed
       new AddClientScreen().setVisible(true);
    }//GEN-LAST:event_insertClientMenuItemActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane cashDeskPane;
    private javax.swing.JMenu clientMenu;
    private javax.swing.JScrollPane clientPane;
    private javax.swing.JTable clientTable;
    private javax.swing.JMenuItem contactMenuItem;
    private javax.swing.JMenuItem deleteClientMenuItem;
    private javax.swing.JMenuItem editClientMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPopupMenu.Separator helpMenuSeparator;
    private javax.swing.JMenuItem helpProgramMenuItem;
    private javax.swing.JMenuItem insertClientMenuItem;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JTabbedPane marketPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu programMenu;
    private javax.swing.JPopupMenu.Separator programMenuSeparator;
    private javax.swing.JMenuItem restartMenuItem;
    private javax.swing.JTabbedPane sellsPane;
    private javax.swing.JTabbedPane storagePane;
    private javax.swing.JTabbedPane supplierPane;
    // End of variables declaration//GEN-END:variables
}
