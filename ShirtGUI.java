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
    
    public ShirtGUI () {
        instructions = new JTextArea ("Please select your three favorite shirts from the options below: "); 
        instructions.setEditable(false); 

        this.setSize(250,250);
        this.add(instructions, BorderLayout.NORTH); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main (String args[]) {
        ShirtGUI test = new ShirtGUI(); 
        test.setVisible(true);
    }

}
