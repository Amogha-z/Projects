import java.util.HashMap;

public class ExtraLetter{
    public String findExtra(String a, String b){
        
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        if(a.equals(b)){
            return "no change";
        }
        for (char c : a.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for (char c : b.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        for(char c : map2.keySet()){
            if(!map1.containsKey(c) || map1.get(c) != map2.get(c)){
                return String.valueOf(c);
            }
        }
        return "no change";
    }

    public static void main(String[] args) {
        ExtraLetter obj = new ExtraLetter();
        System.out.println(obj.findExtra("abcde", "abcded"));
    }
}