package comas;

import comas.windows.BusinessScreen;
import javax.swing.SwingUtilities;
import comas.windows.MainScreen;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Comas
{

    /**
     * Launches the main panel of the application
     */
    private static void launchApplication()
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(3000);
                } // try
                catch (Exception e)
                {
                    e.printStackTrace();
                } // catch
                new MainScreen().setVisible(true);
            } // run

        }); // Runnable
    }

    /**
     * Creates a file that contains the business's basic information.<br/>
     * Uses seperate thread to wait while the user inputs his information.
     * @param file 
     */
    private static void createBusinessFile(File file)
    {
        if (!(file.exists()))
        {
            BusinessScreen businessScreen = new BusinessScreen(file, true);
            businessScreen.setVisible(true);
            
            new PauseThread(businessScreen).run();
        } // if
        launchApplication();
    } // createBusinessFile

    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
        }

        createBusinessFile(new File("businessData.ini"));
    } // main
    
    /**
     * PauseThread is a class responsible for the pause of the program while another service is executed.
     */
    private static class PauseThread implements Runnable
    {
        private final BusinessScreen bs;
        
        private PauseThread(BusinessScreen bs)
        {
            this.bs = bs;
        } // Pausethread
        
        @Override
        public void run()
        {
            //while the business screen for data is active, make the thread sleep for 1 second.
            while(bs.isWindowActive())
            {
                try
                {
                    Thread.sleep(1000);
                } // try
                catch (InterruptedException ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "THREAD ERROR", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } // catch
            } // while
        } // run()
    } // PauseThread
}
