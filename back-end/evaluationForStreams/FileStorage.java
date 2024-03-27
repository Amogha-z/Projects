package evaluationForStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStorage {
    private File f;
    private BufferedReader reader;
    private FileReader fileReader;
    private BufferedWriter writer;
    
    public void writeIntoFile(String data){
        try(FileWriter writer = new FileWriter("/home/mahalakshmi/Desktop/java@zs/evaluationForStreams/data.txt",true)){
            writer.write(data.toString()+"\n");
            writer.flush();
        }catch(FileNotFoundException e){
            System.out.println("couldnt find file.");
        } catch (IOException e) {
            System.out.println("something went wrong");;
        }
        
    }
    public void readFromFile(){
        try {
            f = new File("/home/mahalakshmi/Desktop/java@zs/evaluationForStreams/data.txt");
            if(!f.exists()){
                System.out.println("file not found");
                return;
            }
            fileReader = new FileReader(f);
            reader = new BufferedReader(fileReader);
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.out.println("couldnt find file.");
        } catch (IOException e) {
            System.out.println("something went wrong");;
        } finally{
            try{
                reader.close();
                fileReader.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void deleteFromFile(String name){
        try {
            f = new File("/home/mahalakshmi/Desktop/java@zs/evaluationForStreams/data.txt");
            reader = new BufferedReader(new FileReader(f));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.contains(name)) {
                    content.append(line).append("\n");
                }
            }
            reader.close();

            writer = new BufferedWriter(new FileWriter(f));
            writer.write(content.toString());
            writer.close();

            System.out.println("Content with '" + name + "' deleted from the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                reader.close();
                writer.close();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }
}
