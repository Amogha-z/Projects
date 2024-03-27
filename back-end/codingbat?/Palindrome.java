public class Palindrome {
    public String findPalindrome(String[] array){
        for (String str : array) {
            if(zoho(str)){
                return str;
            }
        }return "";
    }
    public static boolean zoho(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }return true;
    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        String[] array = new String[]{"hello","madam","abcba"};
        System.out.println("['hello','madam','abcba']");
        System.out.println(obj.findPalindrome(array));
    }
}
