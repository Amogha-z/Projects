public class Wave {
    public boolean check(int[] array){
        int before = 0;
        int current;
        int after;
        boolean wave = true;
        for(int i=1; i<array.length-1; i++){
            current = array[i];
            before = array[i-1];
            after = array[i+1];
            if((before>=current && current<=after) || (before<=current && current>=after)){
                wave = true;
            }else{
                wave = false;
            }
        }return wave;
        
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
        int[] array = new int[]{1,2,3,2,1};
        Wave obj = new Wave();
        obj.arrayPrinter(array);
        System.out.println(obj.check(array));
    }
}
