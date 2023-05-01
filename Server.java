import java.util.*;

import javax.crypto.AEADBadTagException;

import java.net.*;
import java.io.*;

public class Server {
    
    ServerSocket serverSocket;    
    ArrayList<Socket> clients = new ArrayList<>(); 
    ArrayList<String> usernames = new ArrayList<>();  
    public static User[] users = new User[2];
    static ArrayList<User> completeUsers = new ArrayList();

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
        while(clients.size()<2) {
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
        
        while (completeUsers.size()<2){
            System.out.print(1);
        }
        DressUpGame.favoriteColor(completeUsers.get(0), completeUsers.get(1));
        DressUpGame.favoritePattern(completeUsers.get(0), completeUsers.get(1));
        DressUpGame.favoriteAesthetic(completeUsers.get(0), completeUsers.get(1));
        DressUpGame.selectOutfit();
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

            WaitingPageGUI wp = new WaitingPageGUI();
            while (clients.size() < 2){
                //should add some kinda waiting screen
                System.out.print("waiting");   
                wp.start(wp);
            }
            wp.dispose();

            ShirtGUI shirtGUI = new ShirtGUI(users[thisUser]);
            shirtGUI.start(shirtGUI);
            
            WaitingPage2GUI wp2 = new WaitingPage2GUI();
            while (DressUpGame.finalOutfit == null){
                System.out.print(2);
                if (completeUsers.contains(users[thisUser])){
                    wp2.start(wp2);
                }
            }
            wp2.dispose();
            DollGUI dollGUI = new DollGUI();
            dollGUI.start();
        }
    }

    public static void setUsers(User user){
        completeUsers.add(user);
    }

    public static void main(String args[]){
        DressUpGame.populateTops(); 
        DressUpGame.populateBottoms();
        DressUpGame.populateShoes();
        DressUpGame.populateOutfit();
        Server server = new Server(Integer.parseInt(args[0])); 
        server.serve();

        /* 
        while ((users[0] != null) && (users[1] != null) && ((users[0].shoes == null) || (users[1].shoes == null))){
            
        }
        DressUpGame.favoriteColor(users[0], users[1]);
        DressUpGame.favoritePattern(users[0], users[1]);
        DressUpGame.favoriteAesthetic(users[0], users[1]);
        DressUpGame.selectOutfit();
        */
    }

}
