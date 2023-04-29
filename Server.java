import java.net.*;
import java.util.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.*;

public class Server {
    
    ServerSocket serverSocket;
    ArrayList<ClientHandler> clients = new ArrayList<>(); 
    ArrayList<String> usernames = new ArrayList<>();  
    User user1 = new User("User1");
    User user2 = new User("User2");
    static User[] users = new User[2];

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


        while(clients.size() < 2) {

            WaitingPageGUI waitingFrame = new WaitingPageGUI();
            waitingFrame.setTitle("Machine Dressing");
            waitingFrame.setSize(500, 500);
            waitingFrame.setVisible(true);

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
            waitingFrame.dispose();
        }

        for (ClientHandler client : clients) {
            client.start(user1, user2);
        }
        

    }
    
    public static void main(String args[]){
        DressUpGame.populateTops(); 
        DressUpGame.populateBottoms();
        DressUpGame.populateShoes();
        try {
            MetalLookAndFeel.setCurrentTheme(new ourTheme());
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }
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