package ClientServer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {   
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String userName;
    
    public Client(Socket socket, String userName){
        try{
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.userName = userName;
        }
        catch(IOException e){
            closeAll(socket,bufferedReader,bufferedWriter);
        }
    }
    public void sendMessage(){
        try{
            bufferedWriter.write(userName);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            Scanner scanner = new Scanner(System.in);
            while(socket.isConnected()){
                String message = scanner.nextLine();
                bufferedWriter.write(userName+": "+message);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
        catch(IOException e){
            closeAll(socket,bufferedReader,bufferedWriter);
        }
    }

    public void listen(){
        new Thread(new Runnable(){
            @Override
            public void run(){
                String messageFromChat;
                while(socket.isConnected()){
                    try{
                        messageFromChat = bufferedReader.readLine();
                        System.out.println(messageFromChat);
                    }
                    catch(IOException e){
                        closeAll(socket,bufferedReader,bufferedWriter);
                    }
                }
            }
        }).start();
    }

    public void closeAll(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter){
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
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name for the chat: ");
        String userName = scanner.nextLine();
        Socket socket = new Socket("localhost",4554);
        Client client = new Client(socket, userName);
        client.listen();
        client.sendMessage();
    }
}
       