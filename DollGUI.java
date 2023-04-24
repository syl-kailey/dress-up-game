import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.net.*;
import java.io.*;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class DollGUI extends JFrame {

    JTextArea message; 

    public DollGUI() {
        message = new JTextArea("Here is your doll's outfit!");
        message.setEditable(false);
        
        this.setSize(250,250);
        this.add(message, BorderLayout.NORTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main (String[] args) {
        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }
        DollGUI sample = new DollGUI(); 
        sample.setVisible(true);
    }
}
