package a25CaesarCipher;
import java.util.Scanner;
public class CaesarCipher {
    private String userInput;
    private String encrypt;
    private String decrypt;
    public String getUserInput(){
        return this.userInput;
    }
    public void setUserInput(String userInput){
        this.userInput=userInput;
    }
    public String getEncrypt(){
        return this.encrypt;
    }
    public void setEncrypt(String encrypt){
        this.encrypt= encrypt;
    }
    public String getDecrypt(){
        return this.decrypt;
    }
    public void setDecrypt(String decrypt){
        this.decrypt = decrypt;
    }

    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        setUserInput(scan.nextLine());
    }
    public String encryption(int val){
        String encryptedString="";
        for (int i=0; i<getUserInput().length(); i++){
            int character = getUserInput().charAt(i);
            char enchar = (char)(character + val);
            encryptedString+=enchar;
        }
        setEncrypt(encryptedString);
        return encryptedString;
    }
    public String decryption(int val){
        String decryptedString="";
        for (int i=0; i<getEncrypt().length();i++){
            int character = getEncrypt().charAt(i);
            char dechar = (char)(character - val);
            decryptedString+=dechar;
        } 
        setDecrypt(decryptedString);
        return decryptedString;
    }
    public static void main(String args[]){
        CaesarCipher obj = new CaesarCipher();
        obj.getInput();
        System.out.println("Encrypted String: "+obj.encryption(3));
        System.out.println("Decrypted String: "+obj.decryption(3));
    }
}
