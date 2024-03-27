public class FirstDay3probs {

    String vowels = "aAiIeEoOuU";
    public void remove1(String input){
        String newString = "";
        for(int i=0; i<input.length(); i++){
            if(vowels.contains(input.charAt(i)+"")){
                newString+="";
            }else{
                newString+=input.charAt(i);
            }
        }System.out.println(newString);
    }
    public void remove2(String input){
        String newString = "";
        boolean isThere;
        for(int i=0; i<input.length(); i++){
            isThere = false;
            for(int j=0; j<vowels.length(); j++){
                if(input.charAt(i)==vowels.charAt(j)){
                    isThere = true;
                    break;
                }
            }newString+=(!isThere) ? input.charAt(i) : "";  
        }System.out.println(newString);
    }

    public void remove5s(int lowerbound,int upperbound){
        int a = 0;
        int b = 0;
        int count = 0;
        for(int i=lowerbound; i<=upperbound; i++){
            a=i%10;
            b = (Math.floorDiv(i,10))%10;
            if(a!=5 && b!=5){
                count++;
            }
        }System.out.println(count);
    }

    public String craftNickname(String[] array){
        String nickname="";
        for(String name : array){
            int random = (int)(Math.random()*name.length());
            System.out.println(random);
            nickname+=name.charAt(random);
        }return nickname;
    }
    public static void main(String[] args) {
        FirstDay3probs object = new FirstDay3probs();
        object.remove1("This website is for losers LOL!");
        // object.remove5s(44,54);
        String[] names = {"chhaya", "midhursha","arsh","balakumaran","aswin"};
        System.out.println(object.craftNickname(names));
    }
}
