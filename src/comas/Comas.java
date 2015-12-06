package comas;

import javax.swing.SwingUtilities;
import comas.windows.MainScreen;

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

    public static void main(String[] args) {
        launchApplication();
    }

}
