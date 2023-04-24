import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import java.lang.reflect.Array;

public class BottomsGUI extends JFrame implements ActionListener {
    
    ArrayList<Bottom> selectedBottoms = new ArrayList<Bottom>();
    Bottom[] allBottoms;

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
        


    }

}
