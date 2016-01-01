package comas.windows;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import comas.Comas;
import comas.base.Client;
import comas.base.Supplier;
import comas.database.ClientDatabase;
import comas.database.Database;
import comas.database.SupplierDatabase;
import comas.database.DeskDatabase;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import static com.itextpdf.text.Chunk.NEWLINE;
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
        loadDeskPane();
        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
    }

    public static void loadClientTable() {
        final String QUERY = "SELECT * FROM Clients";
        
        DefaultTableModel dtm = (DefaultTableModel) new Database().selectTable(QUERY);
        clientTable.setModel(dtm);
    }

     public static void loadDeskPane() {
         
         final String sumIncomesQUERY = "SELECT SUM(FinalPrice) FROM Sells";
         incomesLabel.setText(String.valueOf(new DeskDatabase().sumMoney(sumIncomesQUERY)+" €"));
        
        //  START storageInfosPane 
        final String countProductsQUERY = "SELECT COUNT(*) FROM Products";
        productsLabel.setText(String.valueOf(new DeskDatabase().countRecords(countProductsQUERY)));
        final String sumSellingPriceQUERY = "SELECT SUM(SellingPrice*Stock) FROM Products WHERE Stock > 0";
        finalIncomesLabel.setText(String.valueOf(new DeskDatabase().sumMoney(sumSellingPriceQUERY))+" €");
        final String lowStockQUERY = "SELECT COUNT(*) FROM Products WHERE Stock < 10";
        lowStockLabel.setText(String.valueOf(new DeskDatabase().countRecords(lowStockQUERY)));
        // END storageInfosPane 
         
        //  START outcomesPane
        final String countPurchasesQUERY = "SELECT COUNT(*) FROM Purchases";
        purchasesLabel.setText(String.valueOf(new DeskDatabase().countRecords(countPurchasesQUERY)));
        final String sumOutcomesQUERY = "SELECT SUM(PurchasePrice*Stock) FROM Products WHERE Stock > 0";
        finalOutcomesLabel.setText(String.valueOf(new DeskDatabase().sumMoney(sumOutcomesQUERY))+" €");
        final String countSuppliersQUERY = "SELECT COUNT(*) FROM Suppliers";
        suppliersLabel.setText(String.valueOf(new DeskDatabase().countRecords(countSuppliersQUERY)));
        //  END outcomesPane
        
        // START incomesPane
        final String countSalesQUERY = "SELECT COUNT(*) FROM Sells";
        salesLabel.setText(String.valueOf(new DeskDatabase().countRecords(countSalesQUERY)));
        final String sumProfitQUERY = "SELECT SUM(SellingPrice*Stock)-SUM(PurchasePrice*Stock) FROM Products WHERE Stock >0";
        profitLabel.setText(String.valueOf(new DeskDatabase().sumMoney(sumProfitQUERY))+" €");
        final String countClientsQUERY = "SELECT COUNT(*) FROM Clients";
        clientsLabel.setText(String.valueOf(new DeskDatabase().countRecords(countClientsQUERY)));
        // END incomesPane
    }

    public static void loadSupplierTable() {

        final String QUERY = "SELECT * FROM Suppliers";

        DefaultTableModel dtm = (DefaultTableModel) new Database().selectTable(QUERY);
        supplierTable.setModel(dtm);
    }

    public static void loadStorageTable() {
        //  Selects the StorageId, ProductName, ProductDescription, Supplier's TaxRegister, Product's SellingPrice and Product's Stock
        final String QUERY = "SELECT Storage.StorageId, Storage.ProductId, Products.ProductName, Products.ProductDescription, Products.MeasurementUnit, Products.Weight, Suppliers.TaxRegister, Products.SellingPrice, Products.Stock "
                + "FROM Storage,Products,Suppliers,SuppliersProducts WHERE Storage.ProductId = Products.ProductId AND Products.ProductId = SuppliersProducts.ProductsId AND "
                + "SuppliersProducts.SuppliersId = Suppliers.SupplierId";
        DefaultTableModel dtm = (DefaultTableModel) new Database().selectTable(QUERY);
        storageTable.setModel(dtm);
    }

    public static void loadPurchaseTable() {
        final String QUERY = "SELECT Purchases.purchaseId, Purchases.ProductsId, Products.ProductName, Suppliers.FirstName, Suppliers.LastName, Purchases.Stock, Purchases.FinalPrice "
                + "FROM Purchases,Products,Suppliers WHERE Purchases.ProductsId=Products.ProductId AND Purchases.SupplierId=Suppliers.SupplierId";

        DefaultTableModel dtm = (DefaultTableModel) new Database().selectTable(QUERY);
        purchaseTable.setModel(dtm);
    }

    public static void loadSellTable() {
        final String QUERY = "SELECT Sells.SellId, Sells.ProductsId, Clients.FirstName, Clients.LastName, Products.ProductName, Sells.Stock, Sells.FinalPrice "
                + "FROM Sells, Products, Clients WHERE Sells.ProductsId = Products.ProductId AND Sells.ClientId=Clients.ClientId";

        DefaultTableModel dtm = (DefaultTableModel) new Database().selectTable(QUERY);
        sellTable.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
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
        titleLabel = new javax.swing.JLabel();
        storageInfosPane = new javax.swing.JPanel();
        productsMsgLabel = new javax.swing.JLabel();
        productsLabel = new javax.swing.JLabel();
        lowStockMsgLabel = new javax.swing.JLabel();
        lowStockLabel = new javax.swing.JLabel();
        finalIncomesMsgLabel = new javax.swing.JLabel();
        finalIncomesLabel = new javax.swing.JLabel();
        incomesMsgLabel = new javax.swing.JLabel();
        incomesLabel = new javax.swing.JLabel();
        outcomesPane = new javax.swing.JPanel();
        purchasesMsgLabel = new javax.swing.JLabel();
        purchasesLabel = new javax.swing.JLabel();
        finalOutcomesMsglabel = new javax.swing.JLabel();
        finalOutcomesLabel = new javax.swing.JLabel();
        suppliersMsgLabel = new javax.swing.JLabel();
        suppliersLabel = new javax.swing.JLabel();
        incomesPane = new javax.swing.JPanel();
        salesMsgLabel = new javax.swing.JLabel();
        salesLabel = new javax.swing.JLabel();
        profitMsgLabel = new javax.swing.JLabel();
        profitLabel = new javax.swing.JLabel();
        clientsMsgLabel = new javax.swing.JLabel();
        clientsLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        programMenu = new javax.swing.JMenu();
        restartMenuItem = new javax.swing.JMenuItem();
        programMenuSeparator = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        actionMenu = new javax.swing.JMenu();
        addClientMenuItem = new javax.swing.JMenuItem();
        addSupplierMenuItem = new javax.swing.JMenuItem();
        insertSeparator = new javax.swing.JPopupMenu.Separator();
        newPurchaseMenuItem = new javax.swing.JMenuItem();
        newSellMenuItem = new javax.swing.JMenuItem();
        newSeparator = new javax.swing.JPopupMenu.Separator();
        invoiceMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpProgramMenuItem = new javax.swing.JMenuItem();
        helpMenuSeparator = new javax.swing.JPopupMenu.Separator();
        contactMenuItem = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

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

        sellTable.setAutoCreateRowSorter(true);
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

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLabel.setText("Ταμείο");

        storageInfosPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Αποθύκη"));

        productsMsgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productsMsgLabel.setText("Αριθμός Προιόντων:");

        productsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productsLabel.setText("jLabel1");

        lowStockMsgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lowStockMsgLabel.setText("Μικρο Αποθεμα: ");

        lowStockLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lowStockLabel.setText("jLabel2");

        finalIncomesMsgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        finalIncomesMsgLabel.setText("Εκτιμομενα Εσοδα:");

        finalIncomesLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        finalIncomesLabel.setText("jLabel4");

        javax.swing.GroupLayout storageInfosPaneLayout = new javax.swing.GroupLayout(storageInfosPane);
        storageInfosPane.setLayout(storageInfosPaneLayout);
        storageInfosPaneLayout.setHorizontalGroup(
            storageInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storageInfosPaneLayout.createSequentialGroup()
                .addGroup(storageInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(storageInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(storageInfosPaneLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(productsMsgLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(productsLabel))
                        .addGroup(storageInfosPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lowStockMsgLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lowStockLabel)))
                    .addGroup(storageInfosPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(finalIncomesMsgLabel)
                        .addGap(18, 18, 18)
                        .addComponent(finalIncomesLabel)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        storageInfosPaneLayout.setVerticalGroup(
            storageInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storageInfosPaneLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(storageInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productsMsgLabel)
                    .addComponent(productsLabel))
                .addGap(48, 48, 48)
                .addGroup(storageInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowStockMsgLabel)
                    .addComponent(lowStockLabel))
                .addGap(42, 42, 42)
                .addGroup(storageInfosPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalIncomesMsgLabel)
                    .addComponent(finalIncomesLabel))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        incomesMsgLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        incomesMsgLabel.setText("Έσοδα:");

        incomesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        incomesLabel.setText("jLabel6");

        outcomesPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Εξοδα Επιχειρησεις"));

        purchasesMsgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        purchasesMsgLabel.setText("Συνολο Αγωρών:");

        purchasesLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        purchasesLabel.setText("jLabel8");

        finalOutcomesMsglabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        finalOutcomesMsglabel.setText("Συνολικα Έξοδα:");

        finalOutcomesLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        finalOutcomesLabel.setText("jLabel10");

        suppliersMsgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        suppliersMsgLabel.setText("Προμηθευτές:");

        suppliersLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        suppliersLabel.setText("jLabel17");

        javax.swing.GroupLayout outcomesPaneLayout = new javax.swing.GroupLayout(outcomesPane);
        outcomesPane.setLayout(outcomesPaneLayout);
        outcomesPaneLayout.setHorizontalGroup(
            outcomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outcomesPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outcomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(purchasesMsgLabel)
                    .addComponent(finalOutcomesMsglabel)
                    .addComponent(suppliersMsgLabel))
                .addGap(18, 18, 18)
                .addGroup(outcomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suppliersLabel)
                    .addComponent(finalOutcomesLabel)
                    .addComponent(purchasesLabel))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        outcomesPaneLayout.setVerticalGroup(
            outcomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outcomesPaneLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(outcomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchasesMsgLabel)
                    .addComponent(purchasesLabel))
                .addGap(46, 46, 46)
                .addGroup(outcomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalOutcomesMsglabel)
                    .addComponent(finalOutcomesLabel))
                .addGap(41, 41, 41)
                .addGroup(outcomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suppliersMsgLabel)
                    .addComponent(suppliersLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        incomesPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Έσοδα "));
        incomesPane.setToolTipText("");

        salesMsgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salesMsgLabel.setText("Συνολο Πολησεών");

        salesLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        salesLabel.setText("jLabel12");

        profitMsgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        profitMsgLabel.setText("Κέρδος:");

        profitLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        profitLabel.setText("jLabel14");

        clientsMsgLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clientsMsgLabel.setText("Πελάτες:");

        clientsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clientsLabel.setText("jLabel18");

        javax.swing.GroupLayout incomesPaneLayout = new javax.swing.GroupLayout(incomesPane);
        incomesPane.setLayout(incomesPaneLayout);
        incomesPaneLayout.setHorizontalGroup(
            incomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incomesPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(incomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(incomesPaneLayout.createSequentialGroup()
                        .addComponent(salesMsgLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salesLabel))
                    .addGroup(incomesPaneLayout.createSequentialGroup()
                        .addComponent(profitMsgLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profitLabel))
                    .addGroup(incomesPaneLayout.createSequentialGroup()
                        .addComponent(clientsMsgLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clientsLabel)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        incomesPaneLayout.setVerticalGroup(
            incomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(incomesPaneLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(incomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesMsgLabel)
                    .addComponent(salesLabel))
                .addGap(42, 42, 42)
                .addGroup(incomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profitMsgLabel)
                    .addComponent(profitLabel))
                .addGap(49, 49, 49)
                .addGroup(incomesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientsMsgLabel)
                    .addComponent(clientsLabel))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DeskPaneLayout = new javax.swing.GroupLayout(DeskPane);
        DeskPane.setLayout(DeskPaneLayout);
        DeskPaneLayout.setHorizontalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storageInfosPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outcomesPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeskPaneLayout.createSequentialGroup()
                        .addComponent(incomesPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskPaneLayout.createSequentialGroup()
                        .addComponent(incomesMsgLabel)
                        .addGap(45, 45, 45)
                        .addComponent(incomesLabel)
                        .addGap(65, 65, 65))))
            .addGroup(DeskPaneLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DeskPaneLayout.setVerticalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(25, 25, 25)
                .addGroup(DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(outcomesPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(storageInfosPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(incomesPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incomesMsgLabel)
                    .addComponent(incomesLabel))
                .addGap(17, 17, 17))
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

        addClientMenuItem.setText("Καταχώριση Πελάτη");
        addClientMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientMenuItemActionPerformed(evt);
            }
        });
        actionMenu.add(addClientMenuItem);

        addSupplierMenuItem.setText("Καταχώριση Προμηθευτή");
        addSupplierMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierMenuItemActionPerformed(evt);
            }
        });
        actionMenu.add(addSupplierMenuItem);
        actionMenu.add(insertSeparator);

        newPurchaseMenuItem.setText("Νέα Αγορά");
        newPurchaseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPurchaseMenuItemActionPerformed(evt);
            }
        });
        actionMenu.add(newPurchaseMenuItem);

        newSellMenuItem.setText("Νέα Πώληση");
        newSellMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSellMenuItemActionPerformed(evt);
            }
        });
        actionMenu.add(newSellMenuItem);
        actionMenu.add(newSeparator);

        invoiceMenuItem.setText("Έκδοση τιμολογίου");
        invoiceMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceMenuItemActionPerformed(evt);
            }
        });
        actionMenu.add(invoiceMenuItem);

        menuBar.add(actionMenu);

        helpMenu.setText("Βοήθεια");

        helpProgramMenuItem.setText("Χειρισμός Προγράμματος");
        helpMenu.add(helpProgramMenuItem);
        helpMenu.add(helpMenuSeparator);

        contactMenuItem.setText("Επικοινωνία");
        contactMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactMenuItemActionPerformed(evt);
            }
        });
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

            Client client = new ClientDatabase().selectClient(QUERY);

            EditClientScreen.getInstance(client, clientId).setVisible(true);
        }
    }//GEN-LAST:event_clientTableMouseClicked

    private void addClientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientMenuItemActionPerformed
        AddClientScreen.getInstance().setVisible(true);
    }//GEN-LAST:event_addClientMenuItemActionPerformed

    private void addSupplierMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierMenuItemActionPerformed
        AddSupplierScreen.getInstance().setVisible(true);
    }//GEN-LAST:event_addSupplierMenuItemActionPerformed

    private void supplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTableMouseClicked
        if (evt.getClickCount() > 1) {
            int rowIndex = supplierTable.getSelectedRow();
            int supplierId = Integer.parseInt(supplierTable.getModel().getValueAt(rowIndex, 0).toString());
            final String QUERY = "SELECT * FROM Suppliers WHERE SupplierId=" + supplierId;

            Supplier supplier = new SupplierDatabase().selectSupplier(QUERY);

            EditSupplierScreen.getInstance(supplier, supplierId).setVisible(true);
        }
    }//GEN-LAST:event_supplierTableMouseClicked

    private void newPurchaseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPurchaseMenuItemActionPerformed
        AddPurchaseScreen.getInstance().setVisible(true);
    }//GEN-LAST:event_newPurchaseMenuItemActionPerformed

    private void newSellMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSellMenuItemActionPerformed
        AddSellScreen.getInstance().setVisible(true);
    }//GEN-LAST:event_newSellMenuItemActionPerformed

    private void invoiceMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceMenuItemActionPerformed
        int selectedRow[] = sellTable.getSelectedRows();
        
        if(selectedRow.length == 0)
        {
            JOptionPane.showMessageDialog(this, "<html>Πρώτα πρέπει να επιλέξετε <b>μία εγγραφή πώλησης"
                    + " ενός και μόνο πελάτη</b> για την έκδοση τιμολογίου","Σφάλμα", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String clientName = sellTable.getValueAt(selectedRow[0],2).toString();
        String clientLastName = sellTable.getValueAt(selectedRow[0],3).toString();
        
        for(int i : selectedRow)
        {
            String newName = sellTable.getValueAt(i, 2).toString();
            String newLastName = sellTable.getValueAt(i,3).toString();
            if(!((clientName+clientLastName).equals(newName+newLastName)))
            {
                JOptionPane.showMessageDialog(this, "<html>Διαλέξατε δύο διαφορετικούς πελάτες για την έκδοση τιμολογίου.<br/>"
                        + "Η έκδοση τιμολογίου γίνεται για κάθε άτομο ξεχωριστά.</html>","Σφάλμα", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(("src/comas/res/businessData.ini")))){
            String[] lines = {};
            String line;

            line = br.readLine();
            lines = line.split("//");

            String compName = lines[0];
            String compTaxOffice = lines[1];
            String compTaxRegister = lines[2];
            String compTelephone = lines[3];
            String compFax = lines[4];
            String compCity = lines[5];
            String compAddress = lines[6];

            FontFactory.register("src/comas/res/fonts/Verdana.ttf", "VERDANA_PLAIN_FONT");
            FontFactory.register("src/comas/res/fonts/Verdanab.ttf", "VERDANA_BOLD_FONT");
            Document document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, new FileOutputStream("invoice.pdf")).setInitialLeading(16);
            document.open();

            Font boldFont = FontFactory.getFont("VERDANA_BOLD_FONT", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            boldFont.setSize(10);

            Font plainFont = FontFactory.getFont("VERDANA_PLAIN_FONT", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            plainFont.setSize(10);
            
            Paragraph title = new Paragraph("ΕΚΔΟΣΗ ΤΙΜΟΛΟΓΙΟΥ", boldFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(NEWLINE);
            document.add(new Paragraph("ΟΝΟΜΑ ΕΠΙΧΕΙΡΗΣΗΣ: " + compName, plainFont));
            document.add(new Paragraph("Δ.Ο.Υ ΕΠΙΧΕΙΡΗΣΗΣ: " + compTaxOffice, plainFont));
            document.add(new Paragraph("Α.Φ.Μ ΕΠΙΧΕΙΡΗΣΗΣ: " + compTaxRegister, plainFont));
            document.add(new Paragraph("ΤΗΛΕΦΩΝΟ ΕΠΙΧΕΙΡΗΣΗΣ: " + compTelephone, plainFont));
            document.add(new Paragraph("ΦΑΞ ΕΠΙΧΕΙΡΗΣΗΣ: " + compFax, plainFont));
            document.add(new Paragraph("ΠΟΛΗ ΕΠΙΧΕΙΡΗΣΗΣ: " + compCity, plainFont));
            document.add(new Paragraph("ΔΙΕΥΘΥΝΣΗ ΕΠΙΧΕΙΡΗΣΗΣ: " + compAddress, plainFont));
            document.add(NEWLINE);
            
            document.add(new Paragraph("ΟΝΟΜΑΤΕΠΩΝΥΜΟ ΠΕΛΑΤΗ: " + clientName + " " + clientLastName, plainFont));
            document.add(NEWLINE);
            
            PdfPTable table = new PdfPTable(4);

            PdfPCell c1 = new PdfPCell(new Phrase("ΚΩΔΙΚΟΣ ΠΡΟΙΟΝΤΟΣ", boldFont));
            c1.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("ΟΝΟΜΑ ΠΡΟΙΟΝΤΟΣ", boldFont));
            c1.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("ΠΟΣΟΤΗΤΑ", boldFont));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);

            c1 = new PdfPCell(new Phrase("ΤΙΜΗ", boldFont));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
            table.setHeaderRows(1);
            
            float totalSum = 0.0f;
            for (int i : selectedRow) {
                table.addCell(new Paragraph(sellTable.getValueAt(i,1).toString(), plainFont));
                table.addCell(new Paragraph(sellTable.getValueAt(i,4).toString(), plainFont));
                table.addCell(new Paragraph(sellTable.getValueAt(i,5).toString(), plainFont));
                table.addCell(new Paragraph(sellTable.getValueAt(i,6).toString(), plainFont));
                totalSum += Float.parseFloat(sellTable.getValueAt(i,6).toString());
            }
            
            table.addCell( new Paragraph("ΣΥΝΟΛΟ: ", boldFont));
            table.addCell("");
            table.addCell("");
            table.addCell(new Paragraph(String.valueOf(totalSum)+" €", boldFont));
            document.add(table);
            
            document.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Σφάλμα", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
            return;
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Σφάλμα", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
            return;
        }
        JOptionPane.showMessageDialog(this, "<html>Το τιμολόγιο εκδόθηκε επιτυχώς.</html>", "Επιτυχία", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_invoiceMenuItemActionPerformed

    private void contactMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactMenuItemActionPerformed
        JOptionPane.showMessageDialog(this, "<html><center>Developers: <hr/><br/>Vasilis Chados: "
                + "vasichad@students.kastoria.teikoz.gr<br/>Gabriel Mellides: "
                + "gabmel@students.kastoria.teikoz.gr</center></html>", "Επικοινωνία", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_contactMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DeskPane;
    private javax.swing.JMenu actionMenu;
    private javax.swing.JMenuItem addClientMenuItem;
    private javax.swing.JMenuItem addSupplierMenuItem;
    private javax.swing.JScrollPane clientPane;
    public static javax.swing.JTable clientTable;
    private static javax.swing.JLabel clientsLabel;
    private javax.swing.JLabel clientsMsgLabel;
    private javax.swing.JMenuItem contactMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private static javax.swing.JLabel finalIncomesLabel;
    private javax.swing.JLabel finalIncomesMsgLabel;
    private static javax.swing.JLabel finalOutcomesLabel;
    private javax.swing.JLabel finalOutcomesMsglabel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPopupMenu.Separator helpMenuSeparator;
    private javax.swing.JMenuItem helpProgramMenuItem;
    private static javax.swing.JLabel incomesLabel;
    private javax.swing.JLabel incomesMsgLabel;
    private javax.swing.JPanel incomesPane;
    private javax.swing.JPopupMenu.Separator insertSeparator;
    private javax.swing.JMenuItem invoiceMenuItem;
    private javax.swing.JTextField jTextField1;
    private static javax.swing.JLabel lowStockLabel;
    private javax.swing.JLabel lowStockMsgLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JScrollPane marketPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newPurchaseMenuItem;
    private javax.swing.JMenuItem newSellMenuItem;
    private javax.swing.JPopupMenu.Separator newSeparator;
    private static javax.swing.JPanel outcomesPane;
    private static javax.swing.JLabel productsLabel;
    private javax.swing.JLabel productsMsgLabel;
    private static javax.swing.JLabel profitLabel;
    private javax.swing.JLabel profitMsgLabel;
    private javax.swing.JMenu programMenu;
    private javax.swing.JPopupMenu.Separator programMenuSeparator;
    public static javax.swing.JTable purchaseTable;
    private static javax.swing.JLabel purchasesLabel;
    private javax.swing.JLabel purchasesMsgLabel;
    private javax.swing.JMenuItem restartMenuItem;
    private static javax.swing.JLabel salesLabel;
    private javax.swing.JLabel salesMsgLabel;
    public static javax.swing.JTable sellTable;
    private javax.swing.JScrollPane sellsPane;
    private javax.swing.JPanel storageInfosPane;
    private javax.swing.JScrollPane storagePane;
    public static javax.swing.JTable storageTable;
    private javax.swing.JScrollPane supplierPane;
    public static javax.swing.JTable supplierTable;
    private static javax.swing.JLabel suppliersLabel;
    private javax.swing.JLabel suppliersMsgLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
