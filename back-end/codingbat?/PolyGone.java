
import java.util.ArrayList;

public class PolyGone {
    
    public ArrayList<ArrayList<Integer>> sequences(int[] numbers){
        ArrayList<ArrayList<Integer>> subSequences = new ArrayList<ArrayList<Integer>>();
        generateSubsequences(numbers, 0, new ArrayList<Integer>(), subSequences);
        return subSequences;
    }
    private void generateSubsequences(int[] numbers, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (index == numbers.length) {
            if (current.size() >= 3) {
                result.add(new ArrayList<>(current));
            }
            return;
        }   
        // Case 1: Include the current element
        current.add(numbers[index]);
        generateSubsequences(numbers, index + 1, current, result);
        current.remove(current.size() - 1); // Backtrack
        // Case 2: Exclude the current element
        generateSubsequences(numbers, index + 1, current, result);
    }


    public boolean isPossible(ArrayList<Integer> array){
        int maxL = 0, sum = 0;
        for(int i=0; i<array.size(); i++){
            sum += array.get(i);
            maxL = Math.max(maxL, array.get(i));
        }if((sum-maxL) > maxL){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        PolyGone object = new PolyGone();
        int[] array = new int[]{1,3,1,1,1};
        int count=0;
        ArrayList<ArrayList<Integer>> subsequences = object.sequences(array);
        for(ArrayList<Integer> element : subsequences){
            if(object.isPossible(element)){
                count+=1;
            }
        }
        System.out.println("1,3,1,1,1");
        System.out.println(count);
        
    }
}
