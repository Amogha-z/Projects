package a26MessageApplication;

import java.util.Scanner;
public class PasswordCheck {
    public boolean num(String password){
        int nums=0;
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        for (int i=0; i<password.length(); i++){
            String characs = password.charAt(i)+"";
            for (String str : numbers){
                if (characs.equals(str)){
                    nums++;
                }
            }
        }
        if (nums>0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean spl(String password){
        int splchr=0;
        String[] spls = {"!","@","#","$","%","^","&","*","(",")"};
        for (int i=0; i<password.length(); i++){
            String characs = password.charAt(i)+"";
            for (String str : spls){
                if (characs.equals(str)){
                    splchr++;
                }
            }
        }
        if (splchr>0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean cap(String password){
        int caps=0;
        String[] capitals = {"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};
        for (int i=0; i<password.length(); i++){
            String characs = password.charAt(i)+"";
            for (String str : capitals){
                if (characs.equals(str)){
                    caps++;
                }
            }
        }
        if (caps>0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean len(String password){
        if (password.length()>0){
            return true;
        }
        else{
            return false;
        }
    }
    public String checkPasswordStrength(String password) {
        boolean special = spl(password);
        boolean numbers = num(password);
        boolean length = len(password);
        boolean capital = cap(password);

        if (special && numbers && length && capital) {
            return "strong";
        } else if (special && length && capital) {
            return "moderate, add a number.";
        } else if (special && numbers && length) {
            return "moderate, add capital letters.";
        } else if (numbers && length && capital) {
            return "moderate, add special characters.";
        } else {
            return "weak";
        }
    }
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        PasswordCheck checker = new PasswordCheck();
        System.out.println("Enter your password: ");
        String password = value.nextLine();
        String strength = checker.checkPasswordStrength(password);
        System.out.println("Password strength: " + strength);
    }
}