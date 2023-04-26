import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import java.lang.reflect.Array;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;


public class ShoesGUI extends JFrame implements ActionListener {

    ArrayList<Shoes> selectedShoes = new ArrayList<Shoes>();
    Shoes[] allShoes = DressUpGame.allShoes;

    ImageIcon icon1 = new ImageIcon(allShoes[0].getImageURL());
    Image newimg1 = icon1.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes1 = new JButton(new ImageIcon(newimg1));
    ImageIcon icon2 = new ImageIcon(allShoes[1].getImageURL());
    Image newimg2 = icon2.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes2 = new JButton(new ImageIcon(newimg2));
    ImageIcon icon3 = new ImageIcon(allShoes[2].getImageURL());
    Image newimg3 = icon3.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes3 = new JButton(new ImageIcon(newimg3));
    ImageIcon icon4 = new ImageIcon(allShoes[3].getImageURL());
    Image newimg4 = icon4.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes4 = new JButton(new ImageIcon(newimg4));
    ImageIcon icon5 = new ImageIcon(allShoes[4].getImageURL());
    Image newimg5 = icon5.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes5 = new JButton(new ImageIcon(newimg5));

    ImageIcon icon6 = new ImageIcon(allShoes[5].getImageURL());
    Image newimg6 = icon6.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes6 = new JButton(new ImageIcon(newimg6));
    ImageIcon icon7 = new ImageIcon(allShoes[6].getImageURL());
    Image newimg7 = icon7.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes7 = new JButton(new ImageIcon(newimg7));
    ImageIcon icon8 = new ImageIcon(allShoes[7].getImageURL());
    Image newimg8 = icon8.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes8 = new JButton(new ImageIcon(newimg8));
    ImageIcon icon9 = new ImageIcon(allShoes[8].getImageURL());
    Image newimg9 = icon9.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes9 = new JButton(new ImageIcon(newimg9));
    ImageIcon icon10 = new ImageIcon(allShoes[9].getImageURL());
    Image newimg10 = icon10.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes10 = new JButton(new ImageIcon(newimg10));

    ImageIcon icon11 = new ImageIcon(allShoes[10].getImageURL());
    Image newimg11 = icon11.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes11 = new JButton(new ImageIcon(newimg11));
    ImageIcon icon12 = new ImageIcon(allShoes[11].getImageURL());
    Image newimg12 = icon12.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes12 = new JButton(new ImageIcon(newimg12));
    ImageIcon icon13 = new ImageIcon(allShoes[12].getImageURL());
    Image newimg13 = icon13.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes13 = new JButton(new ImageIcon(newimg13));
    ImageIcon icon14 = new ImageIcon(allShoes[13].getImageURL());
    Image newimg14 = icon14.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes14 = new JButton(new ImageIcon(newimg14));
    ImageIcon icon15 = new ImageIcon(allShoes[14].getImageURL());
    Image newimg15 = icon15.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes15 = new JButton(new ImageIcon(newimg15));

    ImageIcon icon16 = new ImageIcon(allShoes[15].getImageURL());
    Image newimg16 = icon16.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes16 = new JButton(new ImageIcon(newimg16));
    ImageIcon icon17 = new ImageIcon(allShoes[16].getImageURL());
    Image newimg17 = icon17.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes17 = new JButton(new ImageIcon(newimg17));
    ImageIcon icon18 = new ImageIcon(allShoes[17].getImageURL());
    Image newimg18 = icon18.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes18 = new JButton(new ImageIcon(newimg18));
    ImageIcon icon19 = new ImageIcon(allShoes[18].getImageURL());
    Image newimg19 = icon19.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes19 = new JButton(new ImageIcon(newimg19));
    ImageIcon icon20 = new ImageIcon(allShoes[19].getImageURL());
    Image newimg20 = icon20.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton shoes20 = new JButton(new ImageIcon(newimg20));

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
            shoes1.setSelected(true);
        } else if (button == shoes2) {
            selectedShoes.add(allShoes[1]);
            shoes2.setSelected(true);
        } else if (button == shoes3) {
            selectedShoes.add(allShoes[2]);
            shoes3.setSelected(true);
        } else if (button == shoes4) {
            selectedShoes.add(allShoes[3]);
            shoes4.setSelected(true);
        } else if (button == shoes5) {
            selectedShoes.add(allShoes[4]);
            shoes5.setSelected(true);
        } else if (button == shoes6) {
            selectedShoes.add(allShoes[5]);
            shoes6.setSelected(true);
        } else if (button == shoes7) {
            selectedShoes.add(allShoes[6]);
            shoes7.setSelected(true);
        } else if (button == shoes8) {
            selectedShoes.add(allShoes[7]);
            shoes8.setSelected(true);
        } else if (button == shoes9) {
            selectedShoes.add(allShoes[8]);
            shoes9.setSelected(true);
        } else if (button == shoes10) {
            selectedShoes.add(allShoes[9]);
            shoes10.setSelected(true);
        } else if (button == shoes11) {
            selectedShoes.add(allShoes[10]);
            shoes11.setSelected(true);
        } else if (button == shoes12) {
            selectedShoes.add(allShoes[11]);
            shoes12.setSelected(true);
        } else if (button == shoes13) {
            selectedShoes.add(allShoes[12]);
            shoes13.setSelected(true);
        } else if (button == shoes14) {
            selectedShoes.add(allShoes[13]);
            shoes14.setSelected(true);
        } else if (button == shoes15) {
            selectedShoes.add(allShoes[14]);
            shoes15.setSelected(true);
        } else if (button == shoes16) {
            selectedShoes.add(allShoes[15]);
            shoes16.setSelected(true);
        } else if (button == shoes17) {
            selectedShoes.add(allShoes[16]);
            shoes17.setSelected(true);
        } else if (button == shoes18) {
            selectedShoes.add(allShoes[17]);
            shoes18.setSelected(true);
        } else if (button == shoes19) {
            selectedShoes.add(allShoes[18]);
            shoes19.setSelected(true);
        } else if (button == shoes20) {
            selectedShoes.add(allShoes[19]);
            shoes20.setSelected(true);
        }

        if (selectedShoes.size() == 3) {
            /* 
            ShoesGUI shoesGUI = new ShoesGUI();
            shoesGUI.setVisible(true);
            */
            dispose();
        }
    
    }

    public ArrayList<Shoes> getSelectedShoes(){
        return selectedShoes;
    }

    public static void start() {
        //DressUpGame.populateShoes(); //we need to make sure this is done in the main main, not just here

        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        ShoesGUI shoesFrame = new ShoesGUI();
        shoesFrame.setTitle("Machine Dressing");
        shoesFrame.setSize(800, 900);
        shoesFrame.setVisible(true);
    }

}