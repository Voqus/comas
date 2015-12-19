package comas.windows;

import comas.Comas;
import comas.base.Client;
import comas.base.Supplier;
import comas.database.ClientDatabase;
import comas.database.PurchaseDatabase;
import comas.database.StorageDatabase;
import comas.database.SupplierDatabase;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        loadClientTable();
        loadSupplierTable();
        loadStorageTable();
        loadPurchaseTable();
        loadSellTable();

        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
    }

    public static void loadClientTable() {

        final String QUERY = "SELECT * FROM Clients";
        ClientDatabase database = new ClientDatabase();
        database.connect();

        DefaultTableModel dtm = (DefaultTableModel) database.selectTable(QUERY);
        clientTable.setModel(dtm);
        database.close();
    }

    public static void loadSupplierTable() {

        final String QUERY = "SELECT * FROM Suppliers";
        SupplierDatabase database = new SupplierDatabase();
        database.connect();

        DefaultTableModel dtm = (DefaultTableModel) database.selectTable(QUERY);
        supplierTable.setModel(dtm);
        database.close();
    }

    public static void loadStorageTable() {
        //  Selects the StorageId, ProductName, ProductDescription, Supplier's TaxRegister, Product's SellingPrice and Product's Stock
        final String QUERY = "SELECT Storage.StorageId, Products.ProductName, Products.ProductDescription, Products.MeasurementUnit, Products.Weight, Suppliers.TaxRegister, Products.SellingPrice, Products.Stock "
                + "FROM Storage,Products,Suppliers,SuppliersProducts WHERE Storage.ProductId = Products.ProductId AND Products.ProductId = SuppliersProducts.ProductsId AND "
                + "SuppliersProducts.SuppliersId = Suppliers.SupplierId";
        StorageDatabase database = new StorageDatabase();
        database.connect();

        DefaultTableModel dtm = (DefaultTableModel) database.selectTable(QUERY);
        storageTable.setModel(dtm);
        database.close();
    }

    public static void loadPurchaseTable() {
        final String QUERY = "SELECT * FROM Purchases";
        PurchaseDatabase database = new PurchaseDatabase();
        database.connect();

        DefaultTableModel dtm = (DefaultTableModel) database.selectTable(QUERY);
        purchaseTable.setModel(dtm);
        database.close();
    }

    public static void loadSellTable() {
        final String QUERY = "SELECT Sells.SellId, Clients.FirstName, Clients.LastName, Products.ProductName, Sells.Stock, Sells.FinalPrice "
                + "FROM Sells, Products, Clients WHERE Sells.ProductsId = Products.ProductId AND Sells.ClientId=Clients.ClientId";
        PurchaseDatabase database = new PurchaseDatabase();
        database.connect();

        DefaultTableModel dtm = (DefaultTableModel) database.selectTable(QUERY);
        sellTable.setModel(dtm);
        database.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainTabbedPane = new javax.swing.JTabbedPane();
        clientPane = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        supplierPane = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        storagePane = new javax.swing.JScrollPane();
        storageTable = new javax.swing.JTable();
        sellsPane = new javax.swing.JScrollPane();
        sellTable = new javax.swing.JTable();
        marketPane = new javax.swing.JScrollPane();
        purchaseTable = new javax.swing.JTable();
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
        actionMenu = new javax.swing.JMenu();
        addClientMenu = new javax.swing.JMenuItem();
        addSupplierMenu = new javax.swing.JMenuItem();
        addProductMenu = new javax.swing.JMenuItem();
        seperator = new javax.swing.JPopupMenu.Separator();
        newPurchase = new javax.swing.JMenuItem();
        newSell = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpProgramMenuItem = new javax.swing.JMenuItem();
        helpMenuSeparator = new javax.swing.JPopupMenu.Separator();
        contactMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ΛΕΔ: Λογισμικό Εμπορικής Διαχείρησης");
        setMinimumSize(new java.awt.Dimension(800, 504));
        setName("mainFrame"); // NOI18N

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
        clientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientTableMouseClicked(evt);
            }
        });
        clientPane.setViewportView(clientTable);

        mainTabbedPane.addTab("Πελατολόγιο", clientPane);

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        supplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierTableMouseClicked(evt);
            }
        });
        supplierPane.setViewportView(supplierTable);

        mainTabbedPane.addTab("Προμηθευτές", supplierPane);

        storageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        storagePane.setViewportView(storageTable);

        mainTabbedPane.addTab("Αποθήκη", storagePane);

        sellTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        sellsPane.setViewportView(sellTable);

        mainTabbedPane.addTab("Πωλήσεις", sellsPane);

        purchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        marketPane.setViewportView(purchaseTable);

        mainTabbedPane.addTab("Αγορές", marketPane);

        lblBalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBalance.setText("0.00€");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Πληροφορίες Ταμείου");

        lblMsg1.setText("Συνολό Πωλήσεων");

        lblMsg2.setText("Έσοδα:");

        lblMg3.setText("Έξοδα:");

        lblMsg4.setText("Χρήματα");

        javax.swing.GroupLayout DeskPaneLayout = new javax.swing.GroupLayout(DeskPane);
        DeskPane.setLayout(DeskPaneLayout);
        DeskPaneLayout.setHorizontalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeskPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeskPaneLayout.createSequentialGroup()
                        .addComponent(lblMsg1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(DeskPaneLayout.createSequentialGroup()
                        .addGroup(DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMsg2)
                            .addComponent(lblMg3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskPaneLayout.createSequentialGroup()
                        .addGap(0, 330, Short.MAX_VALUE)
                        .addGroup(DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskPaneLayout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(341, 341, 341))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskPaneLayout.createSequentialGroup()
                                .addComponent(lblMsg4)
                                .addGap(18, 18, 18)
                                .addComponent(lblBalance)
                                .addGap(21, 21, 21))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
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
        restartMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartMenuItemActionPerformed(evt);
            }
        });
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

        actionMenu.setText("Ενέργειες");

        addClientMenu.setText("Καταχώριση Πελάτη");
        addClientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientMenuActionPerformed(evt);
            }
        });
        actionMenu.add(addClientMenu);

        addSupplierMenu.setText("Καταχώριση Προμηθευτή");
        addSupplierMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierMenuActionPerformed(evt);
            }
        });
        actionMenu.add(addSupplierMenu);

        addProductMenu.setText("Καταχώριση Προιόντος");
        actionMenu.add(addProductMenu);
        actionMenu.add(seperator);

        newPurchase.setText("Νεα Αγορά");
        newPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPurchaseActionPerformed(evt);
            }
        });
        actionMenu.add(newPurchase);

        newSell.setText("Νέα Πώληση");
        newSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSellActionPerformed(evt);
            }
        });
        actionMenu.add(newSell);

        menuBar.add(actionMenu);

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

    /**
     * Creates a new process of the program and terminates the first one.
     *
     * @param evt
     */
    private void restartMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartMenuItemActionPerformed
        //TODO: try to fix splashscreen

        //Get all arguments needed for the program
        String command = new String();
        command += System.getProperty("java.home") + File.separator + "bin" + File.separator + "java ";
        for (String args : ManagementFactory.getRuntimeMXBean().getInputArguments()) {
            command += args + " ";
        }
        command += "-cp " + ManagementFactory.getRuntimeMXBean().getClassPath() + " ";
        command += Comas.class.getName() + " ";

        try {
            //Create new process
            Runtime.getRuntime().exec(command);
        } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Terminate this program
        System.exit(0);
    }//GEN-LAST:event_restartMenuItemActionPerformed

    private void clientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientTableMouseClicked
        if (evt.getClickCount() > 1) {
            int rowIndex = clientTable.getSelectedRow();
            String clientName = clientTable.getModel().getValueAt(rowIndex, 2).toString();
            int clientId = Integer.parseInt(clientTable.getModel().getValueAt(rowIndex, 0).toString());
            final String QUERY = "SELECT * FROM Clients WHERE FirstName='" + clientName + "'";

            ClientDatabase database = new ClientDatabase();
            database.connect();
            Client client = database.selectClient(QUERY);
            database.close();

            new EditClientScreen(client, clientId).setVisible(true);
        }
    }//GEN-LAST:event_clientTableMouseClicked

    private void addClientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientMenuActionPerformed
        new AddClientScreen().setVisible(true);
    }//GEN-LAST:event_addClientMenuActionPerformed

    private void addSupplierMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierMenuActionPerformed
       new AddSupplierScreen().setVisible(true);
    }//GEN-LAST:event_addSupplierMenuActionPerformed

    private void supplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTableMouseClicked
      if (evt.getClickCount() > 1) {
            int rowIndex = supplierTable.getSelectedRow();
            String supplierId = supplierTable.getModel().getValueAt(rowIndex, 0).toString();
            int clientId = Integer.parseInt(supplierTable.getModel().getValueAt(rowIndex, 0).toString());
            final String QUERY = "SELECT * FROM Suppliers WHERE SupplierId=" + supplierId ;
   
          SupplierDatabase database = new SupplierDatabase();
            database.connect();
            Supplier client = database.selectSupplier(QUERY);
            database.close();

            new EditSupplierScreen(client, clientId).setVisible(true);
        }
    }//GEN-LAST:event_supplierTableMouseClicked

    private void newPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPurchaseActionPerformed
       new AddPurchaseScreen().setVisible(true);
    }//GEN-LAST:event_newPurchaseActionPerformed

    private void newSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSellActionPerformed
       //TODO
       //1. new panel
       //2. product textfields - X stock, if not enough return errors.
       //3. client taxregister textfield to associate on the tables
       //4. insert.
       //5. load on jtable, if success.
       //6. seperate option for pdf extraction
    }//GEN-LAST:event_newSellActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DeskPane;
    private javax.swing.JMenu actionMenu;
    private javax.swing.JMenuItem addClientMenu;
    private javax.swing.JMenuItem addProductMenu;
    private javax.swing.JMenuItem addSupplierMenu;
    private javax.swing.JScrollPane clientPane;
    public static javax.swing.JTable clientTable;
    private javax.swing.JMenuItem contactMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPopupMenu.Separator helpMenuSeparator;
    private javax.swing.JMenuItem helpProgramMenuItem;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblMg3;
    private javax.swing.JLabel lblMsg1;
    private javax.swing.JLabel lblMsg2;
    private javax.swing.JLabel lblMsg4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JScrollPane marketPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newPurchase;
    private javax.swing.JMenuItem newSell;
    private javax.swing.JMenu programMenu;
    private javax.swing.JPopupMenu.Separator programMenuSeparator;
    public static javax.swing.JTable purchaseTable;
    private javax.swing.JMenuItem restartMenuItem;
    public static javax.swing.JTable sellTable;
    private javax.swing.JScrollPane sellsPane;
    private javax.swing.JPopupMenu.Separator seperator;
    private javax.swing.JScrollPane storagePane;
    public static javax.swing.JTable storageTable;
    private javax.swing.JScrollPane supplierPane;
    public static javax.swing.JTable supplierTable;
    // End of variables declaration//GEN-END:variables
}
