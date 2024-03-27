public class Pangram {
    String alphabets = "qwertyuiopasdfghjklzxcvbnm";
    public boolean isPangram(String input){
        for (int i=0; i<alphabets.length(); i++){
            if(!input.toLowerCase().contains(alphabets.charAt(i)+"")){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        Pangram object = new Pangram();
        String input = "Five quacking zephyrs jolt my wax bed";
        String input2 = "The quick brown fox jumps over a lazy dog";
        String input3 = "Hello, im not a pangram";
        System.out.println(input3);
        System.out.println(object.isPangram(input3));
    }
}
