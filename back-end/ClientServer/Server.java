package ClientServer;

import java.io.*;
import java.net.*;

public class Server {
    private ServerSocket serverSocket;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;

    public Server(ServerSocket serverSocket){
        this.serverSocket = serverSocket;
    }
    public void runServer() {
        try {
            while(!serverSocket.isClosed()){
                Socket socket = serverSocket.accept();
                System.out.println("A new Client has connected");
                ClientHandler clientHandler = new ClientHandler(socket);
                this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                Thread thread = new Thread(clientHandler);
                thread.start();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopServer(){
        try{
            if(serverSocket!=null){
                serverSocket.close();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(4554);
        Server object = new Server(serverSocket);
        object.runServer();
    }
}
