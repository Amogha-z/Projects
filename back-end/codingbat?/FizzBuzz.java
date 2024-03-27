public class FizzBuzz {
    public String[] fizzBuzz(int start,int end){
        String[] arrangedArray = new String[end-start];
        for(int i=start; i<end; i++){
            int index = i-start;
            if(i%3==0 && i%5==0){
                arrangedArray[index] = "FizzBuzz";
            }else if(i%3==0){
                arrangedArray[index] = "Fizz";
            }else if(i%5==0){
                arrangedArray[index] = "Buzz";
            }else{
                arrangedArray[index] = String.valueOf(i);
            }
        }return arrangedArray;
    }
    public static void main(String[] args) {
        FizzBuzz object = new FizzBuzz();
        String[] array = object.fizzBuzz(1, 6);
        for(String value : array){
            System.out.println(value);
        }
    }
}
