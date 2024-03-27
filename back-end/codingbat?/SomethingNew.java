public class SomethingNew {
    String s = "abca";
    public static boolean zoho(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else return helper(s,i+1,j) || helper(s,i,j-1);
        }return true;
    }
    public static boolean helper(String s,int i, int j){
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else return false;
        }return true;
    }
    public static void main(String[] args) {
        System.out.println(SomethingNew.zoho("ogl"));
    }
}
