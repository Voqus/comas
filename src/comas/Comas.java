package comas;

import comas.windows.BusinessScreen;
import javax.swing.SwingUtilities;
import comas.windows.MainScreen;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Comas {

    /**
     * Launches the main panel of the application
     */
    private static void launchApplication() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new MainScreen().setVisible(true);
            }

        });
    }

    private static void createBusinessFile(File file) {
        if (!(file.exists())) {
            BusinessScreen businessScreen = new BusinessScreen(file, true);
            businessScreen.setVisible(true);
            
            new PauseThread(businessScreen).run();
        }
        launchApplication();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        createBusinessFile(new File("src/comas/res/businessData.ini"));
    }
    
    private static class PauseThread implements Runnable
    {
        private final BusinessScreen bs;
        
        private PauseThread(BusinessScreen bs)
        {
            this.bs = bs;
        }
        
        @Override
        public void run() {
            while(bs.isWindowActive())
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "THREAD ERROR", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        }
    }
}
