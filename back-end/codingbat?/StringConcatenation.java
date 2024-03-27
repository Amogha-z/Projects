public class StringConcatenation {
    public String concat(String a, String b){
        String concatedString = "";
        int range = Math.max(a.length(),b.length());
        for(int i=0; i<range; i++){
            if(i<a.length()){
                concatedString += a.charAt(i);
            }if(i<b.length()){
                concatedString += b.charAt(i);
            }
        }return concatedString;
    }
    public static void main(String[] args) {
        StringConcatenation object = new StringConcatenation();
        System.out.println(object.concat("tpo", "oCder"));
    }
}
