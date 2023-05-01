import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.net.*;
import java.io.*;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class DollGUI extends JFrame implements ActionListener {
//implements ActionListener 
    String[] hairstyles = new String[12];
    String[] dolls = new String[4];
    //String[] colors = new String[5];
    //Color[] colors = new Color[5];
    String[] colors = new String[5];

    JTextArea message; 
    Image dollImage;
    int hairIndex;
    int skinIndex;
    int colorIndex;
    JLabel doll;
    Image hairImage;
    JLabel hair;
    ImageIcon topImgIcon = new ImageIcon(DressUpGame.finalOutfit.top.getImageURL());
    Image topImg = topImgIcon.getImage().getScaledInstance(350, 222, java.awt.Image.SCALE_SMOOTH);
    JLabel top = new JLabel(new ImageIcon(topImg));
    ImageIcon bottomImgIcon = new ImageIcon(DressUpGame.finalOutfit.bottom.getImageURL());
    Image bottomImg = bottomImgIcon.getImage().getScaledInstance(350, 222, java.awt.Image.SCALE_SMOOTH);
    JLabel bottom = new JLabel(new ImageIcon(bottomImg));
    ImageIcon shoesImgIcon = new ImageIcon(DressUpGame.finalOutfit.shoes.getImageURL());
    Image shoesImg = shoesImgIcon.getImage().getScaledInstance(350, 222, java.awt.Image.SCALE_SMOOTH);
    JLabel shoes = new JLabel(new ImageIcon(shoesImg));
    JButton changeHair = new JButton("Hairstyle");
    JButton changeSkin = new JButton("Skintone");
    JButton changeColor = new JButton("Background");



    public DollGUI(){
        populateColors();
        populateHairstyles();
        populateDolls();
        message = new JTextArea("Here is your doll's outfit!");
        message.setEditable(false);
        hairIndex = 0;
        skinIndex = 0;
        colorIndex = 0;
        dollImage = new ImageIcon(dolls[0]).getImage().getScaledInstance(350, 222, java.awt.Image.SCALE_SMOOTH);
        hairImage = new ImageIcon(hairstyles[0]).getImage().getScaledInstance(350, 222, java.awt.Image.SCALE_SMOOTH);
        doll = new JLabel(new ImageIcon(dollImage));
        hair = new JLabel(new ImageIcon(hairImage));

        /* 
        JLayeredPane pnl  = new JLayeredPane();
        pnl.setLayout(new BorderLayout());
        pnl.add(doll, BorderLayout.CENTER);
        pnl.add(hair, BorderLayout.CENTER);
        pnl.add(top, BorderLayout.CENTER);
        pnl.add(bottom, BorderLayout.CENTER);
        pnl.add(shoes, BorderLayout.CENTER);
        this.add(pnl, BorderLayout.SOUTH);
        */
        JPanel pnl  = new JPanel();
        pnl.setLayout(new GridLayout(3, 1));
        JPanel pnl1 = new JPanel();
        pnl1.setLayout(new BorderLayout());
        JPanel pnl2 = new JPanel();
        pnl2.setLayout(new BorderLayout());
        pnl2.add(doll, BorderLayout.SOUTH);
        pnl2.add(hair, BorderLayout.NORTH);
        pnl.add(top, BorderLayout.NORTH);
        pnl.add(bottom, BorderLayout.CENTER);
        pnl.add(shoes, BorderLayout.SOUTH);
        pnl1.add(pnl, BorderLayout.EAST);
        pnl1.add(pnl2, BorderLayout.WEST);
        pnl.setOpaque(false);
        pnl1.setOpaque(false);
        pnl2.setOpaque(false);
        this.add(pnl1);

        JPanel buttonspnl = new JPanel();
        buttonspnl.setLayout(new BorderLayout());
        buttonspnl.add(changeHair, BorderLayout.NORTH);
        buttonspnl.add(changeColor, BorderLayout.CENTER);
        buttonspnl.add(changeSkin, BorderLayout.SOUTH);
        this.add(buttonspnl, BorderLayout.WEST);


        changeHair.addActionListener(this);
        changeHair.setForeground(Color.decode("#D49066"));
        changeSkin.setForeground(Color.decode("#D49066"));
        changeSkin.addActionListener(this);
        changeColor.setForeground(Color.decode("#D49066"));
        changeColor.addActionListener(this);
    
        this.setSize(250,250);
        this.add(message, BorderLayout.NORTH);
        //this.getContentPane().setBackground(Color.PINK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton) e.getSource();
        if (button == changeHair) {
            if (hairIndex == 11){
                hairIndex = 0;
            }else{
                hairIndex+=1;
            }
            hairImage = new ImageIcon(hairstyles[hairIndex]).getImage().getScaledInstance(350, 222, java.awt.Image.SCALE_SMOOTH);
            //hair = new JLabel(new ImageIcon(hairImage));
            hair.setIcon(new ImageIcon(hairImage));
        } else if (button == changeSkin) {
            if (skinIndex == 3){
                skinIndex = 0;
            }else{
                skinIndex+=1;
            }
            dollImage = new ImageIcon(dolls[skinIndex]).getImage().getScaledInstance(350, 222, java.awt.Image.SCALE_SMOOTH);
            //doll = new JLabel(new ImageIcon(dollImage));
            doll.setIcon(new ImageIcon(dollImage));
        }else if (button == changeColor) {
            if (colorIndex == 4){
                colorIndex = 0;
            }else{
                colorIndex+=1;
            }
            this.getContentPane().setBackground(Color.decode(colors[colorIndex]));
            //dgui.getContentPane().setBackground(colors[colorIndex]);
        }

    }

    public void start(){
        populateHairstyles();
        populateDolls();
        populateColors();
        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }
        DollGUI dollFrame = new DollGUI();
        dollFrame.setTitle("Machine Dressing");
        dollFrame.setSize(800, 600);
        dollFrame.setVisible(true);
        //JLabel top = new JLabel(new ImageIcon(DressUpGame.finalOutfit.top.getImageURL()));
    }

    public void populateHairstyles(){
        hairstyles[0] = "./allpngs/Hair1(1).png";
        hairstyles[1] = "./allpngs/Hair2.png";
        hairstyles[2] = "./allpngs/Hair3.png";
        hairstyles[3] = "./allpngs/Hair4.png";
        hairstyles[4] = "./allpngs/Hair5.png";
        hairstyles[5] = "./allpngs/Hair6.png";
        hairstyles[6] = "./allpngs/Hair7.png";
        hairstyles[7] = "./allpngs/Hair8.png";
        hairstyles[8] = "./allpngs/Hair9.png";
        hairstyles[9] = "./allpngs/Hair10.png";
        hairstyles[10] = "./allpngs/Hair11.png";
        hairstyles[11] = "./allpngs/Hair12.png";
    }

    public void populateColors(){
        //colors[0] = "#FCF6BD";
        colors[0] = "#D49066";
        colors[1] = "#C6D8FF";
        colors[2] = "#FFABC3";
        colors[3] = "#D0A6E2";
        colors[4] = "#6E68BD";
    }

    /* 
    public void populateColors(){
        colors[0] = Color.PINK;
        colors[1] = Color.WHITE;
        colors[2] = Color.YELLOW;
        colors[3] = Color.MAGENTA;
        colors[4] = Color.ORANGE;
    }
    */

    public void populateDolls(){
        dolls[0] = "./allpngs/Doll1.png";
        dolls[1] = "./allpngs/Doll2.png";
        dolls[2] = "./allpngs/Doll3.png";
        dolls[3] = "./allpngs/Doll4.png";
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
