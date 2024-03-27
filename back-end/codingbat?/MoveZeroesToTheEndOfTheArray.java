public class MoveZeroesToTheEndOfTheArray {
    public int[] move(int[] array){
        int nonZero = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] != 0){
                int temp = array[i];
                array[i] = array[nonZero];
                array[nonZero] = temp;
                nonZero++;

            }
        }return array;
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
        MoveZeroesToTheEndOfTheArray object = new MoveZeroesToTheEndOfTheArray();
        int[] array = {2,0,0,5,0,6};
        object.arrayPrinter(object.move(array));
    }
}
