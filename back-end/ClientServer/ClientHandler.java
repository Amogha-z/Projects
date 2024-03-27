package ClientServer;
import java.net.*;
import java.io.*;
import java.util.*;

public class ClientHandler implements Runnable{

    public static ArrayList<ClientHandler>clientHandlers = new ArrayList<>();
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientName;

    public ClientHandler(Socket socket){
        try{
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.clientName = bufferedReader.readLine();
            clientHandlers.add(this);
            broadcast("SERVER: "+clientName+" has entered the chat.");
        }
        catch(IOException e){
            closeAll(socket,bufferedReader,bufferedWriter);
        }
    }
    @Override
    public void run(){
        String message;
        while (socket.isConnected()){
            try{
                message = bufferedReader.readLine();
                broadcast(message);
            }
            catch(IOException e){
                closeAll(socket,bufferedReader,bufferedWriter);
                break;
            }
        }
    }

    public void broadcast(String message){
        for (ClientHandler ch : clientHandlers){
            try {
                if(!ch.clientName.equals(clientName)){
                    ch.bufferedWriter.write(message);
                    ch.bufferedWriter.newLine();
                    ch.bufferedWriter.flush();
                }
            } 
            catch (Exception e) {
                closeAll(socket,bufferedReader,bufferedWriter);
            }
        }
    }
    public void removeClientHandler(){
        clientHandlers.remove(this);
        broadcast("SERVER: "+clientName+" has left the chat.");
    }
    public void closeAll(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter){
        removeClientHandler();
        try{
            if(bufferedReader!=null){
                bufferedReader.close();
            }
            if(bufferedWriter!=null){
                bufferedWriter.close();
            }
            if(socket!=null){
                socket.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
