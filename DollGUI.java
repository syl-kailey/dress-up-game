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

public class DollGUI extends JFrame implements ActionListener {
//implements ActionListener 
    String[] hairstyles = new String[12];
    String[] dolls = new String[4];

    JLabel message; 
    ImageIcon dollImage;
    int hairIndex;
    int skinIndex;
    JLabel doll = new JLabel(dollImage);
    ImageIcon hairImage;
    JLabel hair = new JLabel(hairImage);
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



    public DollGUI(){
        message = new JLabel("Here is your doll's outfit!");
        hairIndex = 0;
        skinIndex = 0;
        dollImage = new ImageIcon(dolls[0]);
        hairImage = new ImageIcon(hairstyles[0]);
        doll = new JLabel(dollImage);
        hair = new JLabel(hairImage);

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
        pnl2.add(doll);
        pnl.add(top, BorderLayout.NORTH);
        pnl.add(bottom, BorderLayout.CENTER);
        pnl.add(shoes, BorderLayout.SOUTH);
        pnl1.add(pnl, BorderLayout.EAST);
        pnl1.add(pnl2, BorderLayout.WEST);
        this.add(pnl1);
        pnl.setOpaque(false);
        pnl1.setOpaque(false);
        pnl2.setOpaque(false);

        JPanel buttonspnl = new JPanel();
        buttonspnl.add(changeHair, BorderLayout.NORTH);
        buttonspnl.add(changeSkin, BorderLayout.SOUTH);
        this.add(buttonspnl, BorderLayout.WEST);


        changeHair.addActionListener(this);
        changeHair.setForeground(Color.decode("#D49066"));
        changeSkin.setForeground(Color.decode("#D49066"));
        changeSkin.addActionListener(this);
    
        this.setSize(250,250);
        this.add(message, BorderLayout.NORTH);
        //this.getContentPane().setBackground(Color.BLUE);
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
            hairImage = new ImageIcon(hairstyles[hairIndex]);
        } else if (button == changeSkin) {
            if (skinIndex == 3){
                skinIndex = 0;
            }else{
                skinIndex+=1;
            }
            dollImage = new ImageIcon(dolls[skinIndex]);
        }

    }

    public void start(){
        populateHairstyles();
        populateDolls();
        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        System.out.println("i exist");
        System.out.println(DressUpGame.finalOutfit);
        DollGUI dollFrame = new DollGUI();
        dollFrame.setTitle("Machine Dressing");
        dollFrame.setSize(800, 600);
        dollFrame.setVisible(true);
        //JLabel top = new JLabel(new ImageIcon(DressUpGame.finalOutfit.top.getImageURL()));
        System.out.println(doll);
        System.out.println(hair);
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
