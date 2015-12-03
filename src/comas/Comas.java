package comas;

import javax.swing.SwingUtilities;
import comas.windows.MainScreen;

public class Comas {

    public static void main(String[] args) {
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

}
