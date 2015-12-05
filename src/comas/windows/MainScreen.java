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
        supplierPane = new javax.swing.JPanel();
        storagePane = new javax.swing.JPanel();
        sellsPane = new javax.swing.JPanel();
        marketPane = new javax.swing.JPanel();
        DeskPane = new javax.swing.JPanel();
        lblBalance = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblMsg1 = new javax.swing.JLabel();
        lblMsg2 = new javax.swing.JLabel();
        lblMg3 = new javax.swing.JLabel();
        lblMsg4 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        programMenu = new javax.swing.JMenu();
        restartMenuItem = new javax.swing.JMenuItem();
        programMenuSeparator = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        clientMenu = new javax.swing.JMenu();
        insertClientMenuItem = new javax.swing.JMenuItem();
        editClientMenuItem = new javax.swing.JMenuItem();
        deleteClientMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
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

        javax.swing.GroupLayout supplierPaneLayout = new javax.swing.GroupLayout(supplierPane);
        supplierPane.setLayout(supplierPaneLayout);
        supplierPaneLayout.setHorizontalGroup(
            supplierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        supplierPaneLayout.setVerticalGroup(
            supplierPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Προμηθευτές", supplierPane);

        javax.swing.GroupLayout storagePaneLayout = new javax.swing.GroupLayout(storagePane);
        storagePane.setLayout(storagePaneLayout);
        storagePaneLayout.setHorizontalGroup(
            storagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        storagePaneLayout.setVerticalGroup(
            storagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Αποθήκη", storagePane);

        javax.swing.GroupLayout sellsPaneLayout = new javax.swing.GroupLayout(sellsPane);
        sellsPane.setLayout(sellsPaneLayout);
        sellsPaneLayout.setHorizontalGroup(
            sellsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        sellsPaneLayout.setVerticalGroup(
            sellsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Πωλήσεις", sellsPane);

        javax.swing.GroupLayout marketPaneLayout = new javax.swing.GroupLayout(marketPane);
        marketPane.setLayout(marketPaneLayout);
        marketPaneLayout.setHorizontalGroup(
            marketPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        marketPaneLayout.setVerticalGroup(
            marketPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        mainTabbedPane.addTab("Αγορές", marketPane);

        lblBalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBalance.setText("0.00€");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Πληροφορίες Ταμείου");

        lblMsg1.setText("Συνολό Πολύσεων");

        lblMsg2.setText("Έσοδα:");

        lblMg3.setText("Έξοδα:");

        lblMsg4.setText("Χρήματα");

        javax.swing.GroupLayout DeskPaneLayout = new javax.swing.GroupLayout(DeskPane);
        DeskPane.setLayout(DeskPaneLayout);
        DeskPaneLayout.setHorizontalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMsg4)
                .addGap(18, 18, 18)
                .addComponent(lblBalance)
                .addGap(21, 21, 21))
            .addGroup(DeskPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeskPaneLayout.createSequentialGroup()
                        .addGap(0, 312, Short.MAX_VALUE)
                        .addComponent(lblTitle)
                        .addGap(341, 341, 341))
                    .addGroup(DeskPaneLayout.createSequentialGroup()
                        .addComponent(lblMsg1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(DeskPaneLayout.createSequentialGroup()
                        .addGroup(DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMsg2)
                            .addComponent(lblMg3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        DeskPaneLayout.setVerticalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(25, 25, 25)
                .addComponent(lblMsg1)
                .addGap(36, 36, 36)
                .addComponent(lblMsg2)
                .addGap(27, 27, 27)
                .addComponent(lblMg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(lblMsg4))
                .addGap(125, 125, 125))
        );

        mainTabbedPane.addTab("Ταμείο", DeskPane);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTabbedPane))
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

        jMenu1.setText("Προμηθευτες");
        menuBar.add(jMenu1);

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
    private javax.swing.JPanel DeskPane;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblMg3;
    private javax.swing.JLabel lblMsg1;
    private javax.swing.JLabel lblMsg2;
    private javax.swing.JLabel lblMsg4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JPanel marketPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu programMenu;
    private javax.swing.JPopupMenu.Separator programMenuSeparator;
    private javax.swing.JMenuItem restartMenuItem;
    private javax.swing.JPanel sellsPane;
    private javax.swing.JPanel storagePane;
    private javax.swing.JPanel supplierPane;
    // End of variables declaration//GEN-END:variables
}
