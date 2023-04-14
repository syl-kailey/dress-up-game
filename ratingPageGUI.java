import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;

public class ratingPageGUI extends JFrame implements ActionListener{

    JTextArea clothingType;
    StarButton star1;
    StarButton star2;
    StarButton star3;
    StarButton star4;
    StarButton star5;
    StarButton star6;
    StarButton star7;
    StarButton star8;
    StarButton star9;
    StarButton star10;

    HashMap<String, Integer> color = new HashMap<String, Integer>();
    HashMap<String, Integer> pattern = new HashMap<String, Integer>();
    HashMap<String, Integer> asethetic = new HashMap<String, Integer>();
    HashMap<String, Integer> outfit = new HashMap<String, Integer>();
    HashMap<String, Integer> Extras = new HashMap<String, Integer>();

    String clothingString;

    BufferedReader reader;
    PrintWriter writer;

    public ratingPageGUI(){

        clothingType = new JTextArea(clothingString);
        clothingType.setForeground(Color.decode("#D49066"));
        clothingType.setOpaque(false);
        clothingType.setEditable(false);

        
        star1 = new StarButton(5, 20, 40, false);
        star1.setForeground(Color.decode("#D49066"));

        star2 = new StarButton(5, 20, 40, false);
        star2.setForeground(Color.decode("#D49066"));

        star3 = new StarButton(5, 20, 40, false);
        star3.setForeground(Color.decode("#D49066"));

        star4 = new StarButton(5, 20, 40, false);
        star4.setForeground(Color.decode("#D49066"));

        star5 = new StarButton(5, 20, 40, false);
        star5.setForeground(Color.decode("#D49066"));

        star6 = new StarButton(5, 20, 40, false);
        star6.setForeground(Color.decode("#D49066"));

        star7 = new StarButton(5, 20, 40, false);
        star7.setForeground(Color.decode("#D49066"));

        star8 = new StarButton(5, 20, 40, false);
        star8.setForeground(Color.decode("#D49066"));

        star9 = new StarButton(5, 20, 40, false);
        star9.setForeground(Color.decode("#D49066"));

        star10 = new StarButton(5, 20, 40, false);
        star10.setForeground(Color.decode("#D49066"));



        JPanel labelPanel = new JPanel(new FlowLayout()); 
        labelPanel.add(clothingType);

        JPanel clothingPanel = new JPanel(new FlowLayout()); 
        clothingPanel.add(clothingType);

        JPanel starPanel = new JPanel(new FlowLayout()); 
        starPanel.add(star1);
        star1.addActionListener(this);
        starPanel.add(star2);
        star2.addActionListener(this);
        starPanel.add(star3);
        star3.addActionListener(this);
        starPanel.add(star4);
        star4.addActionListener(this);
        starPanel.add(star5);
        star5.addActionListener(this);
        starPanel.add(star6);
        star6.addActionListener(this);
        starPanel.add(star7);
        star7.addActionListener(this);
        starPanel.add(star8);
        star8.addActionListener(this);
        starPanel.add(star9);
        star9.addActionListener(this);
        starPanel.add(star10);
        star10.addActionListener(this);



        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(labelPanel);
        container.add(clothingPanel);
        container.add(starPanel);

        this.add(container);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

    }



    public void actionPerformed(ActionEvent e){
        if (e.getSource() == star1 || e.getSource() == star2 ){
            //color -1
            //pattern -1
            //outfit -1 (potentially we get rid of this)
            //aestheic -1
            //if top, type -1
            //if bottom is not pant, isPant -1
            //if show is not heel, hasHeel -1
        }
        else if (e.getSource() == star3 || e.getSource() == star4){
            //color -1
            //pattern -1
            //outfit -1 (potentially we get rid of this)
            //aestheic -1
            //if top, type -1
            //if bottom is not pant, isPant -1
            //if show is not heel, hasHeel -1
        }


        else if (e.getSource() == star4 || e.getSource() == star5 || e.getSource() == star6){
            //color +0.5
            //pattern +0.5
            //outfit +0.5 (potentially we get rid of this)
            //aestheic +0.5
            //if top, type +0.5
            //if bottom is not pant, isPant +0.5
            //if show is not heel, hasHeel +0.5
        }
        else if (e.getSource() == star5){

        }
        else if (e.getSource() == star6){

        }
        else if (e.getSource() == star7){

        }
        else if (e.getSource() == star8){

        }
        else if (e.getSource() == star9){

        }
        else if (e.getSource() == star10){

        }
    }




    public static void main(String args[]){

        ratingPageGUI ratingFrame = new ratingPageGUI();
        ratingFrame.setTitle("Machine Dressing");
        ratingFrame.setSize(300, 300);
        ratingFrame.setVisible(true);
    }

}