package a26MessageApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class LoginMethods {
    String currentTime;
    String date;
    String time;
    FileWriter w;
    public void sendMessages(String sender, String reciever, String message){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy hh:mm:ss");
        currentTime = LocalDateTime.now().format(formatter);
        StringBuffer sBuffer = new StringBuffer(message);
        for(int i=0;i<sBuffer.length();i++){
            if(sBuffer.charAt(i) == ' '){
                sBuffer.setCharAt(i,' ');
            }
        }
        StringTokenizer str = new StringTokenizer(currentTime," ");
        date = str.nextToken();
        time = str.nextToken();
        try{
            w = new FileWriter("a26MessageApplication/Message.txt",true);
            w.write(sBuffer+" from:"+sender+" "+"to:"+reciever+" date:"+date+" time:"+time+"\n");
            w.close();
        }
        catch(IOException e){
            System.out.println("Dont disturb for now.");
        }
    }


    File f = new File("a26MessageApplication/Message.txt");
    public void readMessages(String reciever){
        String str="";

        try{
            Scanner fromWriter = new Scanner(f);
        
            while (fromWriter.hasNextLine()){
                String temp = fromWriter.nextLine();
                StringTokenizer full = new StringTokenizer(temp," ");
                full.nextToken();
                full.nextToken();
                String fullRecieve = full.nextToken();
                StringTokenizer r = new StringTokenizer(fullRecieve,":");
                r.nextToken();
                String recieve = r.nextToken(); 
                if(recieve.equals(reciever)){
                    str+=temp;
                }
            }
            System.out.println(str);
        }
        catch(FileNotFoundException e){
            System.out.println("File doesn't exist");
        }
    }

    File f1 = new File("a26MessageApplication/User.txt");
    public void viewUsers(){
        String names = "";
        try{
            Scanner scanner = new Scanner(f1);
            while(scanner.hasNextLine()){
                String[] userData = scanner.nextLine().split(" ");
                names+=userData[0]+"\n";
            }
            System.out.println(names);
        }
        catch(FileNotFoundException e){
            System.out.println("File doesn't exist");
        }
    }
}
