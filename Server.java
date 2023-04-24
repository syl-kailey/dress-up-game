import java.util.*;

import javax.crypto.AEADBadTagException;

import java.net.*;
import java.io.*;

public class Server {
    
    ServerSocket serverSocket;    
    ArrayList<Socket> clients = new ArrayList<>(); 
    ArrayList<String> usernames = new ArrayList<>();  

    public Server (int port) {

        try{
            serverSocket = new ServerSocket(port);
        } catch(Exception e){
            System.err.print("IOException");
            System.exit(1);
        }

    }
    
    public synchronized void serve() {

        // server waits for two clients to connect 

        //while(clients.size() < 2) {
        while(true) {
            try{
                Socket clientSocket = serverSocket.accept();
                //String username = GWackClientGUI.username; 
                clients.add(clientSocket); 
                //System.out.println(clients.toString()); 
                //GWackClientGUI.f.members.setText(clients.toString());
                (new ClientHandler(clientSocket)).start(); 
                //new ClientHandler(clientSocket, username).start(); 
            } catch (Exception e) {
                System.out.println("error"); 
            }
        }
    }

    private class ClientHandler extends Thread {
        Socket socket;
        //String name;
        public ClientHandler (Socket socket) {
        //public ClientHandler (Socket socket, String username) {
            this.socket = socket; 
            //this.name = username; 
        }
 
        public synchronized void run() {
            ArrayList<Top> list1 = new ArrayList<>(); 
            ArrayList<Bottom> list2 = new ArrayList<>();
            ArrayList<Shoes> list3 = new ArrayList<>(); 

            ShirtGUI shirtGUI = new ShirtGUI();
            shirtGUI.setVisible(true);

            // server displays shirtsGUI to both users and waits for users to each select 3 items, then closes window
            while (true) {
                if (shirtGUI.shirtList.size() == 3) {
                    list1 = shirtGUI.shirtList; 
                    shirtGUI.dispose();
                    break; 
                }
            }

            // repeat for bottomsGUI 
            BottomsGUI bottomsGUI = new BottomsGUI();
            bottomsGUI.setVisible(true);

            while (true) {
                if (bottomsGUI.bottomsList.size() == 3) {
                    list2 = bottomsGUI.bottomsList; 
                    bottomsGUI.dispose(); 
                    break; 
                }
            }

            // and shoesGUI 
            ShoesGUI shoesGUI = new ShoesGUI(); 
            shoesGUI.setVisible(true);

            while (true) {
                if (shoesGUI.shoesList.size() == 3) {
                    list3 = shoesGUI.shoesList; 
                    shoesGUI.dispose(); 
                    break; 
                }
            }

            // analyze preferred characteristics and determine outfit 

            // finally, open window with new doll 
            DollGUI dollGUI = new DollGUI();
            dollGUI.setVisible(true);
        }
    }

    public static void main(String args[]){
        Server server = new Server(Integer.parseInt(args[0])); 
        server.serve();

        //wait until two people connected to run first GUI
        int connectedUsers = 0;
        while (connectedUsers < 2){

            connectedUsers++;
        }
        ShirtsGUI shirtsGUI = new ShirtsGUI();
        shirtsGUI.setVisible(true);
    }

}
