import java.io.*;
import java.net.*;
import java.util.*;

class ClientHandler extends Thread{

    Socket sock;
    PrintWriter writer;
    BufferedReader reader;


    public ClientHandler(Socket sock){
        this.sock=sock;
    }

    public void run(){
        try{
            writer = new PrintWriter(sock.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String key = reader.readLine();

            if (!key.equals("SECRET_KEY")) {
                writer.println("Access denied. Invalid secret key.");
                writer.flush();
                sock.close();
                return;
            } 

            //close the connections
            writer.close();
            reader.close();
            sock.close();
            
        }catch(IOException e){
        }

        //note the loss of the connection
        System.out.println("Connection lost: "+sock.getRemoteSocketAddress());
    }

}