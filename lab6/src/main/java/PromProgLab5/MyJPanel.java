package PromProgLab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.ZoneId;
import java.util.Vector;

/**
 * Class initializing panel with timer
 * @author Glory
 * @version 1.0
 */
public class MyJPanel extends JPanel implements  ActionListener {
    private Timer timer;
    private boolean check=false;
    private JButton button = new JButton("Start");
    private JButton button2 = new JButton("Reset");
    private JLabel label = new JLabel("");
    private String time="0:0:0:0";
    int sec;
    int min;
    int hour;
    int mics;
    public MyJPanel(){
        super();
       // add(label, BorderLayout.CENTER);
        setLayout(new BorderLayout());
        add(button, BorderLayout.EAST);
        add(button2, BorderLayout.WEST);
        timer = new Timer(100,this);
        /**
         * Button realizing timer stop and start
         */
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(check==false) {
                    timer.start();
                    button.setText("Stop");
                    check=true;
                }
                else
                {
                    timer.stop();
                    button.setText("Start");
                    check=false;
                }
            }
        });
        /**
         * Button realizing timer reset
         */
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
                check=true;
                time="0:0:0:0";
                hour=0;
                min=0;
                sec=0;
                mics=0;
                timer.stop();
                check=false;
                repaint();
                button.setText("Start");
            }
        });

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("Courier New",Font.BOLD,35));
        g2d.setColor(new Color(0,0,0));
        g2d.drawString(time,125,150);
        time=(hour+":"+min+":"+sec+":"+mics);

        mics=mics+1;
        if(mics==10)
        {
            mics=0;
            sec=sec+1;
        }
        if(sec==60)
        {
            sec=0;
            min=min+1;
        }
        if(min==60)
        {
            min=0;
            hour=hour+1;
        }
        if(hour==24)
        {
            hour=0;
        }
        g2d.setFont(new Font("Courier New",Font.BOLD,15));
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
