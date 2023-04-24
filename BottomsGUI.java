import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import java.lang.reflect.Array;

public class BottomsGUI extends JFrame implements ActionListener {
    
    ArrayList<Bottom> selectedBottoms = new ArrayList<Bottom>();
    Bottom[] allBottoms = DressUpGame.allBottoms;

    JButton bottom1 = new JButton(new ImageIcon(allBottoms[0].getImageURL()));
    JButton bottom2 = new JButton(new ImageIcon(allBottoms[1].getImageURL()));
    JButton bottom3 = new JButton(new ImageIcon(allBottoms[2].getImageURL()));
    JButton bottom4 = new JButton(new ImageIcon(allBottoms[3].getImageURL()));
    JButton bottom5 = new JButton(new ImageIcon(allBottoms[4].getImageURL()));

    JButton bottom6 = new JButton(new ImageIcon(allBottoms[5].getImageURL()));
    JButton bottom7 = new JButton(new ImageIcon(allBottoms[6].getImageURL()));
    JButton bottom8 = new JButton(new ImageIcon(allBottoms[7].getImageURL()));
    JButton bottom9 = new JButton(new ImageIcon(allBottoms[8].getImageURL()));
    JButton bottom10 = new JButton(new ImageIcon(allBottoms[9].getImageURL()));

    JButton bottom11 = new JButton(new ImageIcon(allBottoms[10].getImageURL()));
    JButton bottom12 = new JButton(new ImageIcon(allBottoms[11].getImageURL()));
    JButton bottom13 = new JButton(new ImageIcon(allBottoms[12].getImageURL()));
    JButton bottom14 = new JButton(new ImageIcon(allBottoms[13].getImageURL()));
    JButton bottom15 = new JButton(new ImageIcon(allBottoms[14].getImageURL()));

    JButton bottom16 = new JButton(new ImageIcon(allBottoms[15].getImageURL()));
    JButton bottom17 = new JButton(new ImageIcon(allBottoms[16].getImageURL()));
    JButton bottom18 = new JButton(new ImageIcon(allBottoms[17].getImageURL()));
    JButton bottom19 = new JButton(new ImageIcon(allBottoms[18].getImageURL()));
    JButton bottom20 = new JButton(new ImageIcon(allBottoms[19].getImageURL()));

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
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton) e.getSource();

        if (button == bottom1) {
            selectedBottoms.add(allBottoms[0]);
        } else if (button == bottom2) {
            selectedBottoms.add(allBottoms[1]);
        } else if (button == bottom3) {
            selectedBottoms.add(allBottoms[2]);
        } else if (button == bottom4) {
            selectedBottoms.add(allBottoms[3]);
        } else if (button == bottom5) {
            selectedBottoms.add(allBottoms[4]);
        } else if (button == bottom6) {
            selectedBottoms.add(allBottoms[5]);
        } else if (button == bottom7) {
            selectedBottoms.add(allBottoms[6]);
        } else if (button == bottom8) {
            selectedBottoms.add(allBottoms[7]);
        } else if (button == bottom9) {
            selectedBottoms.add(allBottoms[8]);
        } else if (button == bottom10) {
            selectedBottoms.add(allBottoms[9]);
        } else if (button == bottom11) {
            selectedBottoms.add(allBottoms[10]);
        } else if (button == bottom12) {
            selectedBottoms.add(allBottoms[11]);
        } else if (button == bottom13) {
            selectedBottoms.add(allBottoms[12]);
        } else if (button == bottom14) {
            selectedBottoms.add(allBottoms[13]);
        } else if (button == bottom15) {
            selectedBottoms.add(allBottoms[14]);
        } else if (button == bottom16) {
            selectedBottoms.add(allBottoms[15]);
        } else if (button == bottom17) {
            selectedBottoms.add(allBottoms[16]);
        } else if (button == bottom18) {
            selectedBottoms.add(allBottoms[17]);
        } else if (button == bottom19) {
            selectedBottoms.add(allBottoms[18]);
        } else if (button == bottom20) {
            selectedBottoms.add(allBottoms[19]);
        }

        if (selectedBottoms.size() == 3) {
            ShoesGUI shoesGUI = new ShoesGUI();
            shoesGUI.setVisible(true);
            dispose();
        }
    
    }

    public ArrayList<Bottom> getSelectedBottoms(){
        return selectedBottoms;
    }

    public static void main(String[] args) {
        DressUpGame.populateBottoms(); 

        BottomsGUI bottomsFrame = new BottomsGUI();
        bottomsFrame.setTitle("Machine Dressing");
        bottomsFrame.setSize(300, 300);
        bottomsFrame.setVisible(true);
    }

}