import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import javax.swing.plaf.metal.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class StartPageGUI extends JFrame implements ActionListener{
    
    Socket socket=null; 
    JTextArea instructions;
    String portStr;
    String host;
    JButton connect;
    int portInt;
    boolean isConnected = false;
    BufferedReader reader;
    PrintWriter writer;

    public StartPageGUI(){

        instructions = new JTextArea("Instructions: Connect to the network. Once both players are connected to the network, you will both be able to rate articles of clothing out of 10. Using both of your preferences, an outfit will be generated.");
        instructions.setLineWrap(true);
        instructions.setWrapStyleWord(true);
        instructions.setPreferredSize(new Dimension(250,250));
        instructions.setForeground(Color.decode("#9C225D"));
        instructions.setOpaque(false);
        instructions.setEditable(false);

        connect = new JButton("Connect");
        connect.setForeground(Color.decode("#D49066"));

        JPanel instrucPanel = new JPanel(new FlowLayout()); 
        instrucPanel.add(instructions);

        JPanel connectPanel = new JPanel(new FlowLayout()); 
        connectPanel.add(connect);

        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(instrucPanel);
        container.add(connectPanel);

        connect.addActionListener(this);

        this.add(container);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == connect){

            if (!isConnected) {
                connect();
            }
        }
    }

    private void connect(){
        host = JOptionPane.showInputDialog("Enter IP Address: ");
        portStr = JOptionPane.showInputDialog("Enter port number: ");
        portInt = Integer.parseInt(portStr);
        try{
            socket = new Socket(host, portInt);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());
            writer.println("SECRET\n3c3c4ac618656ae32b7f3431e75f7b26b1a14a87\n");
            writer.flush();
            isConnected = true;
        }
        catch (IOException ex){
            JOptionPane.showMessageDialog(this, "Failed to connect",
               "Connection Failure", JOptionPane.ERROR_MESSAGE);
            System.err.print("Failed to connect");
            System.exit(1);
        }
        
        ClientHandler client = new ClientHandler(socket);
        client.start();
        isConnected = true;
        this.dispose();
    }

    public static void main(String args[]){
        DressUpGame.populateBottoms();
        DressUpGame.populateShoes();
        DressUpGame.populateTops();

        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }
        StartPageGUI startFrame = new StartPageGUI();

        startFrame.setTitle("Machine Dressing");
        startFrame.setSize(400, 400);
        startFrame.setVisible(true);

    }

}
