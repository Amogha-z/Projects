import java.util.HashMap;

public class Anagram{

    
    public boolean check(String a, String b){
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        if(a==null || b==null || b.length()>a.length() || a.equals("") || b.equals("")){
            return false;
        }
        a = a.replaceAll("\\s", "");
        b = b.replaceAll("\\s", "");
        for (char c : a.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char c : b.toCharArray()){
            if( !map.containsKey(c)|| map.get(c) == 0){
                return false;
            }
            map.put(c, map.get(c)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram obj = new Anagram();
        System.out.println(obj.check("iceman", "ice"));
        System.out.println(obj.check("iceman", "man"));
        System.out.println(obj.check("iceman", "men"));
        System.out.println(obj.check("iceman", "esse"));
        System.out.println(obj.check("iceman", "ace"));
        System.out.println(obj.check("iceman", ""));
    }
}