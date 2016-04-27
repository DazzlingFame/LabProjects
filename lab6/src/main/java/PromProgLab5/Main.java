package PromProgLab5;

import javax.swing.*;
import java.time.ZoneId;
/**
 * Main program function
 * creating panel with timer
 * @author Glory
 * @version 1.0
 */


public class Main extends JFrame {
    /**
     * Constant contains height value
     */
   static protected final int H = 400;
    /**
     * Constant contains width value
     */
   static protected final int W = 400;


    private Main() {
        /**
         * Function sets panel Size
         * @see serSize
         */
        int t;
        int q;
        double r=3.14;
        setSize(W, H);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setContentPane(new MyJPanel());
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
