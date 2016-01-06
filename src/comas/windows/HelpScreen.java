package comas.windows;

public class HelpScreen extends javax.swing.JFrame
{
    public static volatile HelpScreen object;
    
    public static synchronized HelpScreen getInstance()
    {
        if ( object == null )
            object = new HelpScreen();
        
        return object;
    } // getInstance
    /**
     * Creates new form HelpScreen
     */
    private HelpScreen()
    {
        initComponents();
        
        //  Set window's location to the center of the screen
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        textPane = new javax.swing.JScrollPane();
        textEditorPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Χειρισμός Προγράμματος");
        setMinimumSize(new java.awt.Dimension(526, 369));
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("Χειρισμός Προγράμματος");

        textEditorPane.setEditable(false);
        textEditorPane.setContentType("text/html"); // NOI18N
        textEditorPane.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textEditorPane.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n    <p style=\"margin-top: 0\">\r\n       <center><h3>Καταχώριση πελάτη</h3></center>\n         Για να γίνει η καταχώριση ενός πελάτη, επιλέγουμε <b>Ενέργιες->Καταχώριση πελάτη</b> και συμπληρώνουμε τα πεδία.Όλα τα πεδία είναι υποχρεωτικά, και έχουν συγκεκριμένη μορφή εισαγωγής στοιχείων. Σε κάθε πεδίο εάν σύρουμε τον κέρσορα πάνω του θα εμφανιστεί ένα τετράγωνο που περιέχει ένα παράδειγμα για το πώς μπορεί να συμπληρωθεί το κάθε πεδίο.  Αφού συμπληρωθούν τα πεδία και είμαστε σίγουροι ότι τα στοιχεία είναι σωστά επιλέγουμε <b>Επιβεβαίωση</b>.<br/>\n       <center><h3>Επεξεργασία πελάτη</h3></center>\n         Για να γίνει η επεξεργασία ενός πελάτη, κάνουμε διπλό κλίκ σε μία εγγραφή στον πίνακα πελατών(επιλέγουμε την ταμπέλα <b>Πελάτες</>). Αφού γίνει η επεξεργασία με τα απαραίτητα στοιχεία, επιλέγουμε <b>Επιβεβαίωση</b>.<br/>\n       <center><h3>Διαγραφή ενός πελάτη</h3></center>\n         Για να γίνει η διαγραφή ενός πελάτη, κάνουμε διπλό κλίκ σε μία εγγραφή στον πίνακα πελατών(επιλέγουμε την ταμπέλα <b>Πελάτες</b>), και έπειτα επιλέγουμε <b>Διαγραφή</b> αφού είμαστε σίγουροι ότι είναι επιθυμητή η διαγραφή πατάμε <b>Ναι</b> στο προειδοποιητικό μήνυμα.<br/>\n       <center><h3>Καταχώριση προμηθευτή</h3></center>\n         Για να γίνει η καταχώριση ενός προμηθευτή, επιλέγουμε <b>Ενέργιες->Καταχώριση προμηθευτή</b> και συμπληρώνουμε τα πεδία.Όλα τα πεδία είναι υποχρεωτικά, και έχουν συγκεκριμένη μορφή εισαγωγής στοιχείων. Σε κάθε πεδίο εάν σύρουμε τον κέρσορα πάνω του θα εμφανιστεί ένα τετράγωνο που περιέχει ένα παράδειγμα για το πώς μπορεί να συμπληρωθεί το κάθε πεδίο.  Αφού συμπληρωθούν τα πεδία και είμαστε σίγουροι ότι τα στοιχεία είναι σωστά επιλέγουμε <b>Επιβεβαίωση</b>.<br/>\n       <center><h3>Επεξεργασία προμηθευτή</h3></center>\n          Για να γίνει η επεξεργασία ενός προμηθευτή, κάνουμε διπλό κλίκ σε μία εγγραφή στον πίνακα προμηθευτών(επιλέγουμε την ταμπέλα <b>Προμηθευτές</>). Αφού γίνει η επεξεργασία με τα απαραίτητα στοιχεία, επιλέγουμε <b>Επιβεβαίωση</b>.<br/>\n       <center><h3>Διαγραφή προμηθευτή</h3></center>\n          Για να γίνει η διαγραφή ενός προμηθευτή, κάνουμε διπλό κλίκ σε μία εγγραφή στον πίνακα προμηθευτών(επιλέγουμε την ταμπέλα <b>Προμηθευτές</b>), και έπειτα επιλέγουμε <b>Διαγραφή</b> αφού είμαστε σίγουροι ότι είναι επιθυμητή η διαγραφή πατάμε <b>Ναι</b> στο προειδοποιητικό μήνυμα.<br/>\n       <center><h3>Καταχώριση νέας αγοράς</h3></center>\n         Για να γίνει η καταχώριση νέας αγοράς, επιλέγουμε <b>Ενέργιες->Νέα αγορά</b> και συμπληρώνουμε τα πεδία. Όλα τα πεδία είναι υποχρεωτικά, και έχουν συγκεκριμένη μορφή εισαγωγής στοιχείων. Σε κάθε πεδίο εάν σύρουμε τον κέρσορα πάνω του θα εμφανιστεί ένα τετράγωνο που περιέχε έναι παράδειγμα για το πώς μπορεί να συμπληρωθεί το κάθε πεδίο.Το πεδίο του <b>ID προμηθευτή</b> θα πρέπει να συμπληρωθεί σύμφωνα με το ID του προμηθευτή που ήδη υπάρχει στην βάση δεδομένων. Για να το βρούμε αυτό το ID επιλέγουμε στην ταμπέλα <b>Προμηθευτές</b> και ψάχνουμε τον προμηθευτή σύμφωνα με κάποιο κριτήριο, είτε αυτό είναι το ονοματεπώνυμό του είτε το Α.Φ.Μ του.  Αφού συμπληρωθούν τα πεδία και είμαστε σίγουροι ότι τα στοιχεία είναι σωστά επιλέγουμε <b>Επιβεβαίωση</b>.<br/>\n       <center><h3>Καταχώριση νέας πώλησης</h3></center>\n         Για να γίνει η καταχώριση νέας πώλησης, επιλέγουμε <b>Ενέργιες->Νέα πώληση</b> και συμπληρώνουμε τα πεδία. Όλα τα πεδία είναι υποχρεωτικά, και έχουν συγκεκριμένη μορφή εισαγωγής στοιχείων. Σε κάθε πεδίο εάν σύρουμε τον κέρσορα πάνω του θα εμφανιστεί ένα τετράγωνο που περιέχει ένα παράδειγμα για το πώς μπορεί να συμπληρωθεί το κάθε πεδίο.Το πεδίο του <b>ID πελάτη</b> θα πρέπει να συμπληρωθεί σύμφωνα με το ID του πελάτη που ήδη υπάρχει στην βάση δεδομένων. Για να το βρούμε αυτό το ID επιλέγουμε στην ταμπέλα <b>Πελάτες</b> και ψάχνουμε τον πελάτη σύμφωνα με κάποιο κριτήριο, είτε αυτό είναι το ονοματεπώνυμό του είτε το Α.Φ.Μ του. Αφού συμπληρωθούν τα πεδία και είμαστε σίγουροι ότι τα στοιχεία είναι σωστά επιλέγουμε <b>Επιβεβαίωση</b>.<br/>\n       <center><h3>Έκδοση τιμολογίου αγοράς</h3></center>\n         Για να γίνει η έκδοση τιμολογίου αγοράς θα πρέπει να επιλέξουμε κάποιες εγγραφές απο τον πίνακα αγορών(επιλέγουμε την ταμπέλα <b>Αγορές</b>) όπου ο προμηθευτής είναι ο ίδιος σε όλες τις εγγραφές και έπειτα να επιλέξουμε <b>Ενέργιες->Έκδοση τιμολογίου αγοράς.</b><br/>\n       <center><h3>Έκδοση τιμολογίου πώλησης</h3></center>\n         Για να γίνει η έκδοση τιμολογίου πώλησης θα πρέπει να επιλέξουμε κάποιες εγγραφές απο τον πίνακα πωλήσεων(επιλέγουμε την ταμπέλα <b>Πωλήσεις</b>) όπου ο πελάτης είναι ο ίδιος σε όλες τις εγγραφές και έπειτα να επιλέξουμε <b>Ενέργιες->Έκδοση τιμολογίου πώλησης.</b><br/>\n    </p>\r\n  </body>\r\n</html>\r\n");
        textPane.setViewportView(textEditorPane);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPane, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPane, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JEditorPane textEditorPane;
    private javax.swing.JScrollPane textPane;
    // End of variables declaration//GEN-END:variables
}
