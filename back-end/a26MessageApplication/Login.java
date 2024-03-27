package a26MessageApplication;

import java.util.Scanner;
import java.io.*;
public class Login {
    private String name;
    private String password;

    public void loginAccount() {
        File file;
        CaesarCipher cipher = new CaesarCipher();

        try {
            Scanner inp = new Scanner(System.in);
            file = new File("a26MessageApplication/User.txt");
            Scanner scan = new Scanner(file);
            System.out.println("Enter your name: ");
            name = inp.nextLine();
            
            while (scan.hasNextLine()) {
                String[] userData = scan.nextLine().split(" ");
                if (userData[0].equals(name)) {
                    int tries = 3;
                    while (tries > 0) {
                        System.out.println("Enter your password: ");
                        password = (inp.nextLine());
                        cipher.setUserInput(password);
                        String encryptedPass = cipher.encryption(3);
                        if (userData[1].equals(encryptedPass)) {
                            System.out.println("Successfully logged in.");
                            return;
                        } 
                        else {
                            tries--;
                            System.out.println("Incorrect password. " + tries + " tries remaining.");
                        }
                    }
                    System.out.println("Login failed. Please try again later.");
                    return;
                }
            }
    
            System.out.println("Username not found. Please check your username.");
        } 
        catch (IOException e) {
            System.out.println("File not found.");
        }
    }
    
    public static void main(String[] args){
        Login object = new Login();
        object.loginAccount();
        LoginMethods obj = new LoginMethods();
        obj.sendMessages("Maha", "Bala", "Hi Bala");
        obj.readMessages("bala");
    }
}
