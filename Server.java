import java.net.*;
import java.util.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.*;

public class Server {
    
    ServerSocket serverSocket;
    ArrayList<ClientHandler> clients = new ArrayList<>(); 
    ArrayList<String> usernames = new ArrayList<>();  
    public static User[] users = new User[2];
    static ArrayList<User> completeUsers = new ArrayList();
    User user1 = new User("user1");
    User user2 = new User("user2");
    static int finishSelection;

    public Server (int port) {

        try{
            serverSocket = new ServerSocket(port);
        } catch(Exception e){
            System.err.print("IOException");
            System.exit(1);
        }

    }

    public ServerSocket getServer() {
        return serverSocket;
    }
    
    public void serve() {

        boolean clientsReady = false;
        finishSelection=0;
        WaitingPageGUI waitingFrame = new WaitingPageGUI();
        waitingFrame.start(waitingFrame);

        while(clients.size() < 2) {
            try{
                Socket clientSocket = serverSocket.accept();
                clients.add(new ClientHandler(clientSocket)); 
                if (users[0] == null){
                    users[0] = user1;
                }
                else{
                    users[1] = user2;
                }
            } catch (Exception e) {
                System.out.println("error"); 
            }
        }

        waitingFrame.dispose();
        clientsReady=true;
        WaitingPage2GUI waitingFrame2 = new WaitingPage2GUI();
        if (clientsReady) {
            
            clients.get(0).start(user1, user2);
            waitingFrame2.start(waitingFrame2);
        }
        
        waitingFrame2.dispose();
        DressUpGame.favoriteColor(completeUsers.get(0), completeUsers.get(1));
        DressUpGame.favoritePattern(completeUsers.get(0), completeUsers.get(1));
        DressUpGame.favoriteAesthetic(completeUsers.get(0), completeUsers.get(1));
        DressUpGame.selectOutfit();

    }

    public static void setUsers(User user){
        completeUsers.add(user);
    }

    public static void finishSelection(){
        finishSelection++;
        System.out.print(finishSelection + "players finished");
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