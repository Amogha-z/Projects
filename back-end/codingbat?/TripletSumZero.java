public class TripletSumZero {
    public StringBuilder returnTriplets(int[] array){
        int a = 0;
        int b = 0;
        int c = 0;
        StringBuilder output = new StringBuilder();
        output.append("[");
        if(array.length>=3){
            for(int i=0; i<array.length; i++){
                for(int j=i+1; j<array.length; j++){
                    for(int k=j+1; k<array.length; k++){
                        if(i != j && i != k && j != k && (array[i]+array[j]+array[k] == 0)){
                            a = array[i];
                            b = array[j];
                            c = array[k];
                            output.append("["+(a+" ")+(b+" ")+(c)+"]");
                        }
                    }
                }
            }output.append("]");
        }return output;
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
        TripletSumZero object = new TripletSumZero();
        int[] numbers = {-1,0,1,2,-1,-4};
        object.arrayPrinter(numbers);
        System.out.println(object.returnTriplets(numbers));
    }
    
}
