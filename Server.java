import java.util.*;
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
        // then, server displays shirtsGUI to both users and waits for users to each select 3 items, then closes window
        // repeat for bottomsGUI and shoesGUI 
        // finally, open window with new doll 

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
            ShirtGUI shirtGUI = new ShirtGUI();
        }
    }

    public static void main(String args[]){
        Server server = new Server(Integer.parseInt(args[0])); 
        server.serve();
    }

}
