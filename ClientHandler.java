import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread {
    Socket socket;
    User user1;
    User user2;
    //String name;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        //this.name = username; 
    }

    public void start(User user1, User user2) {
        run(user1, user2);
    }

    public void run(User user1, User user2) {
        try {
            ArrayList<Top> list1 = new ArrayList<>(); 
            ArrayList<Bottom> list2 = new ArrayList<>();
            ArrayList<Shoes> list3 = new ArrayList<>(); 

            System.out.println(user1.getName());
            System.out.println(user2.getName());

            ShirtGUI shirtFrame1 = new ShirtGUI(user1);
            shirtFrame1.start(user1, shirtFrame1);

            ShirtGUI shirtFrame2 = new ShirtGUI(user2);
            shirtFrame2.start(user2, shirtFrame2);

            
            while (DressUpGame.outfitSelected == false){
                
            }
            DollGUI dollGUI = new DollGUI();
            dollGUI.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
