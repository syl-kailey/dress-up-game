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

public class DollGUI extends JFrame  {
//implements ActionListener 

    JTextArea message; 
    Outfit outfit;

    public DollGUI(Outfit outfit){
        message = new JTextArea("Here is your doll's outfit!");
        message.setEditable(false);
        ImageIcon doll = new ImageIcon("./allpngs/Doll1.png");
        ImageIcon top = new ImageIcon(DressUpGame.finalOutfit.top.getImageURL());
        ImageIcon bottom = new ImageIcon(DressUpGame.finalOutfit.bottom.getImageURL());
        ImageIcon shoes = new ImageIcon(DressUpGame.finalOutfit.shoes.getImageURL());
        JPanel pnl  = new JPanel();
        //pnl.setLayout(new BorderLayout());
        //pnl.add(doll, BorderLayout.CENTER);
        
        this.setSize(250,250);
        this.add(message, BorderLayout.NORTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public void start(Outfit outfit, Frame frame){
        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        frame.setTitle("Machine Dressing");
        frame.setSize(800, 600);
        frame.setVisible(true);
        /*
        ShirtGUI topsFrame = new ShirtGUI(null);
        topsFrame.setTitle("Machine Dressing");
        topsFrame.setSize(800, 600);
        topsFrame.setVisible(true);
        */
    }

}
