public class NumbersAddUpToTheTarget {
    public String addUp(int[] array, int target){
        String result = "[";
        if(array.length!=0){
            boolean found = false;
            for(int i=0; i<array.length; i++){
                for(int j=i+1; j<array.length; j++){
                    if(array[i] + array[j] == target){
                        result += i+","+j;
                        found = true;
                    }
                }if(found){
                    break;
                }
            }result+="]";
        }return result;
    }
    public static void main(String[] args) {
        NumbersAddUpToTheTarget object = new NumbersAddUpToTheTarget();
        int[] numbers = {2,3,4,11,5};
        System.out.println(object.addUp(numbers, 7));
    }
}
