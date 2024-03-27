public class ConsecutiveVowels {
    String vowels = "aAiIeEoOuU";
    String newString="";
    public void remove(String input){
        newString += (vowels.contains(input.charAt(1)+"") || !vowels.contains(input.charAt(0)+"")) ? input.charAt(0) : ""; 
        for(int i=1; i<input.length()-1; i++){
            if(!vowels.contains(input.charAt(i)+"")){
                newString+=input.charAt(i);
            }else{
                newString += (vowels.contains(input.charAt(i+1)+"") || vowels.contains(input.charAt(i-1)+"")) ? input.charAt(i) : "";
            }
        }newString += (vowels.contains(input.charAt(input.length()-2)+"") || !vowels.contains(input.charAt(input.length()-1)+"")) ? input.charAt(input.length()-1) : "";
        System.out.println(newString);
    }
    public static void main(String[] args) {
        ConsecutiveVowels obj = new ConsecutiveVowels();
        obj.remove("hellou");

    }
}
