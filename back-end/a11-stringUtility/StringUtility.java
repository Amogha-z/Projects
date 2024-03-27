import java.util.Scanner;
public class StringUtility{
    public static void main(String args[]){
        StringUtilityTool oper = new StringUtilityTool();
        oper.getTextInput();
        oper.validate();
    }
}
class StringUtilityTool {
    String text = "";
    public void getTextInput(){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        while(object.hasNextLine()){
            String temporary = object.nextLine();
            if (temporary.equals("quit")){
                break;
            }
            else{
                text = text + temporary.trim() + "\n";
            }
        }
    }
    public int countCharacters(String text){
        return text.length();
    }
    public int countWords(String text){
        int wcount=0;
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i)==' '){
                wcount++;
            }
            if (text.charAt(i)=='\n'){
                wcount++;
            }
        }
        return wcount;
    }
    public int countLines(String text){
        int lcount=0;
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i)=='\n'){
                lcount++;
            }
        }
        return lcount;
    }
    public boolean containsCharSequence(String text){
        System.out.println("enter a character : ");
        Scanner obj = new Scanner (System.in);
        String val = obj.nextLine();
        int textLen = text.length();
        int seqLen = val.length();
        for(int i=0; i<=textLen-seqLen; i++){
            boolean yes = true;
            for (int j=0; j<seqLen; j++){
                if (text.charAt(i+j)!=val.charAt(j)){
                    yes = false;
                    break;
                }
            }
            if(yes){
                return true;
            }
        }
        return false;
    }
    public boolean countSubstring(String text){
        System.out.println("enter the word: ");
        Scanner obj = new Scanner(System.in);
        String val = obj.nextLine();
        if (text.contains(val)){
            return true;
        }
        else{
            return false;
        }
    }
    public String LowerCase(String text){
        return text.toLowerCase();
    }
    public String UpperCase(String text){
        return text.toUpperCase();
    }
    public String reverse(String text){
        int len=text.length();
        String reversed = "";
        for(int i= len-1; i>=0;i--){
            reversed+=text.charAt(i);
        }
        return reversed;
    }
    public String toggleCase(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } 
            else if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String(charArray);
    }
    public void validate(){
        int noOfCharacter = countCharacters(text);
        System.out.println("Character count : " + "\n" + noOfCharacter);
        int noOfWords = countWords(text);
        System.out.println("Word count : " + "\n" + noOfWords);
        System.out.println("Line count : " + "\n" + countLines(text));
        System.out.println("the sequence exists: " + "\n" + containsCharSequence(text));
        System.out.println("words/substring exists: " + "\n" + countSubstring(text));
        System.out.println("Lower case : " + "\n" + LowerCase(text));
        System.out.println("Upper case : " + "\n" + UpperCase(text));
        System.out.println("Toggle Case : " + "\n" + toggleCase(text));
        System.out.println("Reverse : " + "\n" + reverse(text));
    }
}
