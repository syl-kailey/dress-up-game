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
<<<<<<< HEAD
    Top sampleTop = new Top(1, "top1.png");
    ArrayList<Top> shirtList = new ArrayList<>(); 

=======
    Top sampleTop = new Top(1, "allpngs\top1.png");
    Top sampleDoll = new Top(1, "Doll3.png");
    
>>>>>>> 0fee3549c2b2c424b7aa2569d316c4b5eb8abbf3
    public ShirtGUI () {
        instructions = new JTextArea ("Please select your three favorite shirts from the options below: "); 
        instructions.setEditable(false); 

<<<<<<< HEAD
        /*for (Top shirt: allTops) {
            ImageIcon shirtImage = new ImageIcon(shirt.imageURL); 
            JLabel shirtLabel = new JLabel(shirtImage); 

            shirtLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    // System.out.println("test");
                    // store this 
                    shirtList.add(shirt)
                    // count to 3 and close 
                }
            })
        }*/
=======
        ImageIcon dollImage = new ImageIcon(sampleDoll.imageURL);
>>>>>>> 0fee3549c2b2c424b7aa2569d316c4b5eb8abbf3

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
        ShirtGUI test = new ShirtGUI(); 
        test.setVisible(true);
    }

}
