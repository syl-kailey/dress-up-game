import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;

public class startPageGUI extends JFrame implements ActionListener{
    Socket socket=null; 
    JTextField ip_address;
    JTextField port;
    String portStr;
    String host;
    JButton connect;
    int portInt;
    boolean isConnected = false;
    BufferedReader reader;
    PrintWriter writer;

    public startPageGUI(){

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
            ip_address.setText(host);
            port.setText(portStr);
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
    }

}