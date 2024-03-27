package a26MessageApplication;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUp {
    private String name;
    private String password;

    public void createAccount() {
        FileWriter f;
        PasswordCheck checker = new PasswordCheck();
        CaesarCipher cipher = new CaesarCipher();
        try {
            f = new FileWriter("a26MessageApplication/User.txt", true);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your name: ");
            name = scan.nextLine();
            f.write(name + " ");

            boolean isStrongPassword = false;
            while (!isStrongPassword) {
                System.out.println("Enter password: ");
                password = scan.nextLine();
                boolean special = checker.spl(password);
                boolean numbers = checker.num(password);
                boolean length = checker.len(password);
                boolean capital = checker.cap(password);

                if (special && numbers && length && capital) {
                    System.out.println("Account created!");
                    isStrongPassword = true;
                } 
                else {
                    boolean validChoice = false;
                    while (!validChoice) {
                        System.out.println("Weak password. Do you want to enter a new password? (yes/no): ");
                        String choice = scan.nextLine();
                        if (choice.equalsIgnoreCase("yes")) {
                            validChoice = true;
                        } 
                        else if (choice.equalsIgnoreCase("no")) {
                            validChoice = true;
                            isStrongPassword = true;
                            System.out.println("Account created!");
                        } 
                        else {
                            System.out.println("Please enter only 'yes' or 'no'.");
                        }
                    }
                }
            }
            cipher.setUserInput(password);
            String encryptedPass = cipher.encryption(3);
            f.write(encryptedPass + "\n");
            f.close();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
    public static void main(String[] args) {
        SignUp obj = new SignUp();
        obj.createAccount();
    }
}
