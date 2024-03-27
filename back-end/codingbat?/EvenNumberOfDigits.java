public class EvenNumberOfDigits {
    
    public int evenNumbered(int[] numbers){
        int count = 0;
        int finalCount = 0;
        for(int i : numbers){
            while (i>0){
                i /= 10;
                count++;
            }
            if(count%2==0){
                finalCount++;
            }
        }
        return finalCount;
    }

    public static void main(String[] args) {
        EvenNumberOfDigits obj = new EvenNumberOfDigits();
        int[] numbers = new int[]{2,12,456,2345,123456,644};

        System.out.println(obj.evenNumbered(numbers));
    }
}
