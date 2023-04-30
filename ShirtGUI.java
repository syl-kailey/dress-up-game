import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import java.lang.reflect.Array;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;



public class ShirtGUI extends JFrame implements ActionListener {

    User user;
    ArrayList<Top> selectedTops = new ArrayList<Top>();
    Top[] allTops = DressUpGame.allTops;


    ImageIcon icon1 = new ImageIcon(allTops[0].getImageURL());
    Image newimg1 = icon1.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top1 = new JButton(new ImageIcon(newimg1));
    ImageIcon icon2 = new ImageIcon(allTops[1].getImageURL());
    Image newimg2 = icon2.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top2 = new JButton(new ImageIcon(newimg2));
    ImageIcon icon3 = new ImageIcon(allTops[2].getImageURL());
    Image newimg3 = icon3.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top3 = new JButton(new ImageIcon(newimg3));
    ImageIcon icon4 = new ImageIcon(allTops[3].getImageURL());
    Image newimg4 = icon4.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top4 = new JButton(new ImageIcon(newimg4));
    ImageIcon icon5 = new ImageIcon(allTops[4].getImageURL());
    Image newimg5 = icon5.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top5 = new JButton(new ImageIcon(newimg5));

    ImageIcon icon6 = new ImageIcon(allTops[5].getImageURL());
    Image newimg6 = icon6.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top6 = new JButton(new ImageIcon(newimg6));
    ImageIcon icon7 = new ImageIcon(allTops[6].getImageURL());
    Image newimg7 = icon7.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top7 = new JButton(new ImageIcon(newimg7));
    ImageIcon icon8 = new ImageIcon(allTops[7].getImageURL());
    Image newimg8 = icon8.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top8 = new JButton(new ImageIcon(newimg8));
    ImageIcon icon9 = new ImageIcon(allTops[8].getImageURL());
    Image newimg9 = icon9.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top9 = new JButton(new ImageIcon(newimg9));
    ImageIcon icon10 = new ImageIcon(allTops[9].getImageURL());
    Image newimg10 = icon10.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top10 = new JButton(new ImageIcon(newimg10));

    ImageIcon icon11 = new ImageIcon(allTops[10].getImageURL());
    Image newimg11 = icon11.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top11 = new JButton(new ImageIcon(newimg11));
    ImageIcon icon12 = new ImageIcon(allTops[11].getImageURL());
    Image newimg12 = icon12.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top12 = new JButton(new ImageIcon(newimg12));
    ImageIcon icon13 = new ImageIcon(allTops[12].getImageURL());
    Image newimg13 = icon13.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top13 = new JButton(new ImageIcon(newimg13));
    ImageIcon icon14 = new ImageIcon(allTops[13].getImageURL());
    Image newimg14 = icon14.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top14 = new JButton(new ImageIcon(newimg14));
    ImageIcon icon15 = new ImageIcon(allTops[14].getImageURL());
    Image newimg15 = icon15.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top15 = new JButton(new ImageIcon(newimg15));

    ImageIcon icon16 = new ImageIcon(allTops[15].getImageURL());
    Image newimg16 = icon16.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top16 = new JButton(new ImageIcon(newimg16));
    ImageIcon icon17 = new ImageIcon(allTops[16].getImageURL());
    Image newimg17 = icon17.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top17 = new JButton(new ImageIcon(newimg17));
    ImageIcon icon18 = new ImageIcon(allTops[17].getImageURL());
    Image newimg18 = icon18.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top18 = new JButton(new ImageIcon(newimg18));
    ImageIcon icon19 = new ImageIcon(allTops[18].getImageURL());
    Image newimg19 = icon19.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top19 = new JButton(new ImageIcon(newimg19));
    ImageIcon icon20 = new ImageIcon(allTops[19].getImageURL());
    Image newimg20 = icon20.getImage().getScaledInstance(400, 254, java.awt.Image.SCALE_SMOOTH);
    JButton top20 = new JButton(new ImageIcon(newimg20));

    public ShirtGUI(User user){
        this.user = user;
        System.out.println(user);
        setLayout(new GridLayout(4, 5));

        add(top1);
        add(top2);
        add(top3);
        add(top4);
        add(top5);
        add(top6);
        add(top7);
        add(top8);
        add(top9);
        add(top10);
        add(top11);
        add(top12);
        add(top13);
        add(top14);
        add(top15);
        add(top16);
        add(top17);
        add(top18);
        add(top19);
        add(top20);

        top1.addActionListener(this);
        top2.addActionListener(this);
        top3.addActionListener(this);
        top4.addActionListener(this);
        top5.addActionListener(this);
        top6.addActionListener(this);
        top7.addActionListener(this);
        top8.addActionListener(this);
        top9.addActionListener(this);
        top10.addActionListener(this);

        top11.addActionListener(this);
        top12.addActionListener(this);
        top13.addActionListener(this);
        top14.addActionListener(this);
        top15.addActionListener(this);
        top16.addActionListener(this);
        top17.addActionListener(this);
        top18.addActionListener(this);
        top19.addActionListener(this);
        top20.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        //setVisible(true);
    }

    public User getUser(){
        return user;
    }

    public void actionPerformed(ActionEvent e) {
        
        
        JButton button = (JButton) e.getSource();
        if (button == top1) {
            selectedTops.add(allTops[0]);
            top1.setSelected(true);
        } else if (button == top2) {
            selectedTops.add(allTops[1]);
            top2.setSelected(true);
        } else if (button == top3) {
            selectedTops.add(allTops[2]);
            top3.setSelected(true);
        } else if (button == top4) {
            selectedTops.add(allTops[3]);
            top4.setSelected(true);
        } else if (button == top5) {
            selectedTops.add(allTops[4]);
            top5.setSelected(true);
        } else if (button == top6) {
            selectedTops.add(allTops[5]);
            top6.setSelected(true);
        } else if (button == top7) {
            selectedTops.add(allTops[6]);
            top7.setSelected(true);
        } else if (button == top8) {
            selectedTops.add(allTops[7]);
            top8.setSelected(true);
        } else if (button == top9) {
            selectedTops.add(allTops[8]);
            top9.setSelected(true);
        } else if (button == top10) {
            selectedTops.add(allTops[9]);
            top10.setSelected(true);
        } else if (button == top11) {
            selectedTops.add(allTops[10]);
            top11.setSelected(true);
        } else if (button == top12) {
            selectedTops.add(allTops[11]);
            top12.setSelected(true);
        } else if (button == top13) {
            selectedTops.add(allTops[12]);
            top13.setSelected(true);
        } else if (button == top14) {
            selectedTops.add(allTops[13]);
            top14.setSelected(true);
        } else if (button == top15) {
            selectedTops.add(allTops[14]);
            top15.setSelected(true);
        } else if (button == top16) {
            selectedTops.add(allTops[15]);
            top16.setSelected(true);
        } else if (button == top17) {
            selectedTops.add(allTops[16]);
            top17.setSelected(true);
        } else if (button == top18) {
            selectedTops.add(allTops[17]);
            top18.setSelected(true);
        } else if (button == top19) {
            selectedTops.add(allTops[18]);
            top19.setSelected(true);
        } else if (button == top20) {
            selectedTops.add(allTops[19]);
            top20.setSelected(true);
        }

        if (selectedTops.size() == 3) {
            user.insertTops(selectedTops);
            BottomsGUI bottomsGUI = new BottomsGUI(user);
            bottomsGUI.setVisible(true);
            dispose();
        }
    
    }

    public void finishTops(User user, ArrayList<Top> selectedTops){
        System.out.println(user.getName());
        user.insertTops(selectedTops);
        BottomsGUI bottomsFrame = new BottomsGUI(user);
        bottomsFrame.start(user, bottomsFrame);
        dispose();
    }

    public ArrayList<Top> getSelectedTops(){
        return selectedTops;
    }

    public static void start(ShirtGUI sg) {
        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }

        ShirtGUI topsFrame = sg;
        topsFrame.setTitle("Machine Dressing");
        topsFrame.setSize(800, 600);
        topsFrame.setVisible(true);
    }

}