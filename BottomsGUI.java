import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import java.lang.reflect.Array;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;


public class BottomsGUI extends JFrame implements ActionListener {

    ArrayList<Bottom> selectedBottoms = new ArrayList<Bottom>();
    Bottom[] allBottoms = DressUpGame.allBottoms;

    ImageIcon icon1 = new ImageIcon(allBottoms[0].getImageURL());
    Image newimg1 = icon1.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom1 = new JButton(new ImageIcon(newimg1));
    ImageIcon icon2 = new ImageIcon(allBottoms[1].getImageURL());
    Image newimg2 = icon2.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom2 = new JButton(new ImageIcon(newimg2));
    ImageIcon icon3 = new ImageIcon(allBottoms[2].getImageURL());
    Image newimg3 = icon3.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom3 = new JButton(new ImageIcon(newimg3));
    ImageIcon icon4 = new ImageIcon(allBottoms[3].getImageURL());
    Image newimg4 = icon4.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom4 = new JButton(new ImageIcon(newimg4));
    ImageIcon icon5 = new ImageIcon(allBottoms[4].getImageURL());
    Image newimg5 = icon5.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom5 = new JButton(new ImageIcon(newimg5));

    ImageIcon icon6 = new ImageIcon(allBottoms[5].getImageURL());
    Image newimg6 = icon6.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom6 = new JButton(new ImageIcon(newimg6));
    ImageIcon icon7 = new ImageIcon(allBottoms[6].getImageURL());
    Image newimg7 = icon7.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom7 = new JButton(new ImageIcon(newimg7));
    ImageIcon icon8 = new ImageIcon(allBottoms[7].getImageURL());
    Image newimg8 = icon8.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom8 = new JButton(new ImageIcon(newimg8));
    ImageIcon icon9 = new ImageIcon(allBottoms[8].getImageURL());
    Image newimg9 = icon9.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom9 = new JButton(new ImageIcon(newimg9));
    ImageIcon icon10 = new ImageIcon(allBottoms[9].getImageURL());
    Image newimg10 = icon10.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom10 = new JButton(new ImageIcon(newimg10));

    ImageIcon icon11 = new ImageIcon(allBottoms[10].getImageURL());
    Image newimg11 = icon11.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom11 = new JButton(new ImageIcon(newimg11));
    ImageIcon icon12 = new ImageIcon(allBottoms[11].getImageURL());
    Image newimg12 = icon12.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom12 = new JButton(new ImageIcon(newimg12));
    ImageIcon icon13 = new ImageIcon(allBottoms[12].getImageURL());
    Image newimg13 = icon13.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom13 = new JButton(new ImageIcon(newimg13));
    ImageIcon icon14 = new ImageIcon(allBottoms[13].getImageURL());
    Image newimg14 = icon14.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom14 = new JButton(new ImageIcon(newimg14));
    ImageIcon icon15 = new ImageIcon(allBottoms[14].getImageURL());
    Image newimg15 = icon15.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom15 = new JButton(new ImageIcon(newimg15));

    ImageIcon icon16 = new ImageIcon(allBottoms[15].getImageURL());
    Image newimg16 = icon16.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom16 = new JButton(new ImageIcon(newimg16));
    ImageIcon icon17 = new ImageIcon(allBottoms[16].getImageURL());
    Image newimg17 = icon17.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom17 = new JButton(new ImageIcon(newimg17));
    ImageIcon icon18 = new ImageIcon(allBottoms[17].getImageURL());
    Image newimg18 = icon18.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom18 = new JButton(new ImageIcon(newimg18));
    ImageIcon icon19 = new ImageIcon(allBottoms[18].getImageURL());
    Image newimg19 = icon19.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom19 = new JButton(new ImageIcon(newimg19));
    ImageIcon icon20 = new ImageIcon(allBottoms[19].getImageURL());
    Image newimg20 = icon20.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton bottom20 = new JButton(new ImageIcon(newimg20));

    public BottomsGUI(){
        setLayout(new GridLayout(4, 5));

        add(bottom1);
        add(bottom2);
        add(bottom3);
        add(bottom4);
        add(bottom5);
        add(bottom6);
        add(bottom7);
        add(bottom8);
        add(bottom9);
        add(bottom10);
        add(bottom11);
        add(bottom12);
        add(bottom13);
        add(bottom14);
        add(bottom15);
        add(bottom16);
        add(bottom17);
        add(bottom18);
        add(bottom19);
        add(bottom20);

        bottom1.addActionListener(this);
        bottom2.addActionListener(this);
        bottom3.addActionListener(this);
        bottom4.addActionListener(this);
        bottom5.addActionListener(this);
        bottom6.addActionListener(this);
        bottom7.addActionListener(this);
        bottom8.addActionListener(this);
        bottom9.addActionListener(this);
        bottom10.addActionListener(this);

        bottom11.addActionListener(this);
        bottom12.addActionListener(this);
        bottom13.addActionListener(this);
        bottom14.addActionListener(this);
        bottom15.addActionListener(this);
        bottom16.addActionListener(this);
        bottom17.addActionListener(this);
        bottom18.addActionListener(this);
        bottom19.addActionListener(this);
        bottom20.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        //setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton) e.getSource();
        button.setForeground(Color.PINK); 

        if (button == bottom1) {
            selectedBottoms.add(allBottoms[0]);
            bottom1.setSelected(true);
        } else if (button == bottom2) {
            selectedBottoms.add(allBottoms[1]);
            bottom2.setSelected(true);
        } else if (button == bottom3) {
            selectedBottoms.add(allBottoms[2]);
            bottom3.setSelected(true);
        } else if (button == bottom4) {
            selectedBottoms.add(allBottoms[3]);
            bottom4.setSelected(true);
        } else if (button == bottom5) {
            selectedBottoms.add(allBottoms[4]);
            bottom5.setSelected(true);
        } else if (button == bottom6) {
            selectedBottoms.add(allBottoms[5]);
            bottom6.setSelected(true);
        } else if (button == bottom7) {
            selectedBottoms.add(allBottoms[6]);
            bottom7.setSelected(true);
        } else if (button == bottom8) {
            selectedBottoms.add(allBottoms[7]);
            bottom8.setSelected(true);
        } else if (button == bottom9) {
            selectedBottoms.add(allBottoms[8]);
            bottom9.setSelected(true);
        } else if (button == bottom10) {
            selectedBottoms.add(allBottoms[9]);
            bottom10.setSelected(true);
        } else if (button == bottom11) {
            selectedBottoms.add(allBottoms[10]);
            bottom11.setSelected(true);
        } else if (button == bottom12) {
            selectedBottoms.add(allBottoms[11]);
            bottom12.setSelected(true);
        } else if (button == bottom13) {
            selectedBottoms.add(allBottoms[12]);
            bottom13.setSelected(true);
        } else if (button == bottom14) {
            selectedBottoms.add(allBottoms[13]);
            bottom14.setSelected(true);
        } else if (button == bottom15) {
            selectedBottoms.add(allBottoms[14]);
            bottom15.setSelected(true);
        } else if (button == bottom16) {
            selectedBottoms.add(allBottoms[15]);
            bottom16.setSelected(true);
        } else if (button == bottom17) {
            selectedBottoms.add(allBottoms[16]);
            bottom17.setSelected(true);
        } else if (button == bottom18) {
            selectedBottoms.add(allBottoms[17]);
            bottom18.setSelected(true);
        } else if (button == bottom19) {
            selectedBottoms.add(allBottoms[18]);
            bottom19.setSelected(true);
        } else if (button == bottom20) {
            selectedBottoms.add(allBottoms[19]);
            bottom20.setSelected(true);
        }

        if (selectedBottoms.size() == 3) {
            ShoesGUI shoesGUI = new ShoesGUI();
            shoesGUI.setVisible(true);//need to call an actual method like main to populate shoes, set theme, etc
            //alternatively, we could just return to the method we call this from and call shoes from there but either
            // way we still need a method in shoes (and bottoms and shirts) to be called that isnt a main
            dispose();
        }
    
    }

    public ArrayList<Bottom> getSelectedBottoms(){
        return selectedBottoms;
    }
    public static void start() {

        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        BottomsGUI bottomsFrame = new BottomsGUI();
        bottomsFrame.setTitle("Machine Dressing");
        bottomsFrame.setSize(800, 600);
        bottomsFrame.setVisible(true);
    }

}