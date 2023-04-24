import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import java.lang.reflect.Array;

public class ShoesGUI extends JFrame implements ActionListener {
    
    ArrayList<Shoes> selectedShoes = new ArrayList<Shoes>();
    Shoes[] allShoes;

    JButton shoes1 = new JButton(new ImageIcon(allShoes[0].getImageURL()));
    JButton shoes2 = new JButton(new ImageIcon(allShoes[1].getImageURL()));
    JButton shoes3 = new JButton(new ImageIcon(allShoes[2].getImageURL()));
    JButton shoes4 = new JButton(new ImageIcon(allShoes[3].getImageURL()));
    JButton shoes5 = new JButton(new ImageIcon(allShoes[4].getImageURL()));

    JButton shoes6 = new JButton(new ImageIcon(allShoes[5].getImageURL()));
    JButton shoes7 = new JButton(new ImageIcon(allShoes[6].getImageURL()));
    JButton shoes8 = new JButton(new ImageIcon(allShoes[7].getImageURL()));
    JButton shoes9 = new JButton(new ImageIcon(allShoes[8].getImageURL()));
    JButton shoes10 = new JButton(new ImageIcon(allShoes[9].getImageURL()));

    JButton shoes11 = new JButton(new ImageIcon(allShoes[10].getImageURL()));
    JButton shoes12 = new JButton(new ImageIcon(allShoes[11].getImageURL()));
    JButton shoes13 = new JButton(new ImageIcon(allShoes[12].getImageURL()));
    JButton shoes14 = new JButton(new ImageIcon(allShoes[13].getImageURL()));
    JButton shoes15 = new JButton(new ImageIcon(allShoes[14].getImageURL()));

    JButton shoes16 = new JButton(new ImageIcon(allShoes[15].getImageURL()));
    JButton shoes17 = new JButton(new ImageIcon(allShoes[16].getImageURL()));
    JButton shoes18 = new JButton(new ImageIcon(allShoes[17].getImageURL()));
    JButton shoes19 = new JButton(new ImageIcon(allShoes[18].getImageURL()));
    JButton shoes20 = new JButton(new ImageIcon(allShoes[19].getImageURL()));

    public ShoesGUI(){
        setLayout(new GridLayout(4, 5));

        add(shoes1);
        add(shoes2);
        add(shoes3);
        add(shoes4);
        add(shoes5);
        add(shoes6);
        add(shoes7);
        add(shoes8);
        add(shoes9);
        add(shoes10);
        add(shoes11);
        add(shoes12);
        add(shoes13);
        add(shoes14);
        add(shoes15);
        add(shoes16);
        add(shoes17);
        add(shoes18);
        add(shoes19);
        add(shoes20);

        shoes1.addActionListener(this);
        shoes2.addActionListener(this);
        shoes3.addActionListener(this);
        shoes4.addActionListener(this);
        shoes5.addActionListener(this);
        shoes6.addActionListener(this);
        shoes7.addActionListener(this);
        shoes8.addActionListener(this);
        shoes9.addActionListener(this);
        shoes10.addActionListener(this);

        shoes11.addActionListener(this);
        shoes12.addActionListener(this);
        shoes13.addActionListener(this);
        shoes14.addActionListener(this);
        shoes15.addActionListener(this);
        shoes16.addActionListener(this);
        shoes17.addActionListener(this);
        shoes18.addActionListener(this);
        shoes19.addActionListener(this);
        shoes20.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        JButton button = (JButton) e.getSource();

        if (button == shoes1) {
            selectedShoes.add(allShoes[0]);
        } else if (button == shoes2) {
            selectedShoes.add(allShoes[1]);
        } else if (button == shoes3) {
            selectedShoes.add(allShoes[2]);
        } else if (button == shoes4) {
            selectedShoes.add(allShoes[3]);
        } else if (button == shoes5) {
            selectedShoes.add(allShoes[4]);
        } else if (button == shoes6) {
            selectedShoes.add(allShoes[5]);
        } else if (button == shoes7) {
            selectedShoes.add(allShoes[6]);
        } else if (button == shoes8) {
            selectedShoes.add(allShoes[7]);
        } else if (button == shoes9) {
            selectedShoes.add(allShoes[8]);
        } else if (button == shoes10) {
            selectedShoes.add(allShoes[9]);
        } else if (button == shoes11) {
            selectedShoes.add(allShoes[10]);
        } else if (button == shoes12) {
            selectedShoes.add(allShoes[11]);
        } else if (button == shoes13) {
            selectedShoes.add(allShoes[12]);
        } else if (button == shoes14) {
            selectedShoes.add(allShoes[13]);
        } else if (button == shoes15) {
            selectedShoes.add(allShoes[14]);
        } else if (button == shoes16) {
            selectedShoes.add(allShoes[15]);
        } else if (button == shoes17) {
            selectedShoes.add(allShoes[16]);
        } else if (button == shoes18) {
            selectedShoes.add(allShoes[17]);
        } else if (button == shoes19) {
            selectedShoes.add(allShoes[18]);
        } else if (button == shoes20) {
            selectedShoes.add(allShoes[19]);
        }

        if (selectedShoes.size() == 3) {
            dispose();
        }
    
    }

    public ArrayList<Shoes> getSelectedShoes(){
        dispose();
        return selectedShoes;
    }

}