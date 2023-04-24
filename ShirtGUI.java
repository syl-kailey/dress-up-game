import javax.swing.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class ShirtGUI extends JFrame {

    JTextArea instructions; 
    Top sampleTop = new Top(1, "./allpngs/top1.png");
    ArrayList<Top> shirtList = new ArrayList<>(); 
    Top[] allTops;

    public ShirtGUI () {
        instructions = new JTextArea ("Please select your three favorite shirts from the options below: "); 
        instructions.setEditable(false); 

        DressUpGame.populateTops(); 
        this.allTops = DressUpGame.allTops; 

        // add each shirt to GUI panel as the loop continues so that they all appear 
        for (Top shirt: allTops) {
            ImageIcon shirtImage = new ImageIcon(shirt.imageURL); 
            JLabel shirtLabel = new JLabel(shirtImage); 

            shirtLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    // System.out.println("test");
                    // store this 
                    shirtList.add(shirt); 
                    // count to 3 and close 
                }
            });
        }

        ImageIcon topImage = new ImageIcon(sampleTop.imageURL);
        JLabel topLabel = new JLabel(topImage);


        topLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("test");
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
        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }
        ShirtGUI test = new ShirtGUI(); 
        test.setVisible(true);
    }

}
