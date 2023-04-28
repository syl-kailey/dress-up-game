import java.util.*;

import javax.crypto.AEADBadTagException;

import java.net.*;
import java.io.*;

public class Server {
    
    ServerSocket serverSocket;    
    ArrayList<Socket> clients = new ArrayList<>(); 
    ArrayList<String> usernames = new ArrayList<>();  
    static User[] users = new User[2];

    public Server (int port) {

        try{
            serverSocket = new ServerSocket(port);
        } catch(Exception e){
            System.err.print("IOException");
            System.exit(1);
        }

    }


    
    public void serve() {

        users[0] = new User();
        users[1] = new User();
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

            int thisUser = clients.size()-1;//will be 0 or 1

            while (clients.size() < 2){
                //should add some kinda waiting screen
                System.out.print("waiting");
            }

            ShirtGUI shirtGUI = new ShirtGUI(users[thisUser]);
            shirtGUI.start();
            
            while (DressUpGame.outfitSelected == false){
                
            }
            DollGUI dollGUI = new DollGUI();
            dollGUI.start();
        }
    }

    public static void main(String args[]){
        DressUpGame.populateTops(); 
        DressUpGame.populateBottoms();
        DressUpGame.populateShoes();
        Server server = new Server(Integer.parseInt(args[0])); 
        server.serve();

        while ((users[0] != null) && (users[1] != null) && ((users[0].shoes == null) || (users[1].shoes == null))){
            
        }
        DressUpGame.favoriteColor(users[0], users[1]);
        DressUpGame.favoritePattern(users[0], users[1]);
        DressUpGame.favoriteAesthetic(users[0], users[1]);
        DressUpGame.selectOutfit();
    }

}
