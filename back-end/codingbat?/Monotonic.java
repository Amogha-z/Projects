public class Monotonic {
    public boolean check(int[] array){
        int before = 0;
        int current;
        int after;
        boolean monotonic = true;
        for(int i=1; i<array.length-1; i++){
            current = array[i];
            before = array[i-1];
            after = array[i+1];
            if(current==before || before==after || current==after){
                return false;
            }
            else if((before<=current && current<=after) || (before>=current && current>=after)){
                monotonic = true;
            }else{
                monotonic = false;
            }
        }return monotonic;
    }
    public void arrayPrinter(int[] array){
        StringBuilder string = new StringBuilder();
        string.append("[");
        for(int i = 0; i<array.length; i++){
            string.append(array[i]);
            if(i<array.length-1){
                string.append(", ");
            }
        }
        string.append("]");
        System.out.println(string);
    }
    public static void main(String[] args) {
        Monotonic obj = new Monotonic();
        int[] array = new int[]{6,5,4,3};
        obj.arrayPrinter(array);
        System.out.println(obj.check(array));
    }
}
