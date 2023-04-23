import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class ShirtGUI extends JFrame {

    JTextArea instructions; 
    Top sampleTop = new Top(1, "top1.png");
    
    public ShirtGUI () {
        instructions = new JTextArea ("Please select your three favorite shirts from the options below: "); 
        instructions.setEditable(false); 

        ImageIcon topImage = new ImageIcon(sampleTop.imageURL);
        JLabel topLabel = new JLabel(topImage);

        topLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // System.out.println("test");
                // store this 
            } 
        });

        this.setSize(250,250);
        this.add(instructions, BorderLayout.NORTH);
        this.add(topLabel, BorderLayout.SOUTH); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main (String args[]) {
        ShirtGUI test = new ShirtGUI(); 
        test.setVisible(true);
    }

}
