import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.*;

public class DollGUI extends JFrame {

    JTextArea message; 

    public DollGUI() {
        message = new JTextArea("Here is your doll's outfit!");
        message.setEditable(false);
        
        this.setSize(250,250);
        this.add(message, BorderLayout.NORTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main (String[] args) {
        DollGUI sample = new DollGUI(); 
        sample.setVisible(true);
    }
}
