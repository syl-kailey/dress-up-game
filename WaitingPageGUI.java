import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class WaitingPageGUI extends JFrame{
    JFrame frame;
    JPanel panel;
    JLabel waitingLabel;
    
    public WaitingPageGUI() {
        frame = new JFrame("Waiting Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        waitingLabel = new JLabel("Waiting for both players to join...");
        waitingLabel.setHorizontalAlignment(JLabel.CENTER);
        waitingLabel.setVerticalAlignment(JLabel.CENTER);
        waitingLabel.setFont(new Font("Arial", Font.BOLD, 24));
        
        panel.add(waitingLabel, BorderLayout.CENTER);
        
        this.getContentPane().add(panel);
        this.pack();
    }

    public static void start(WaitingPageGUI frame) {
        
        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        frame.setTitle("Machine Dressing");
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
