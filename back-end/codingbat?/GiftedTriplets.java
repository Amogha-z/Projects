import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class GiftedTriplets{

    public int getCount(int[] array){
        int maximumPossible=0;
        HashMap<Integer,Integer> counter = new HashMap<Integer,Integer>();
        for(int i=0; i<array.length; i++){
            if(counter.containsKey(array[i])){
                counter.put(array[i],counter.get(array[i])+1);
            }else{
                counter.put(array[i],1);
            }
        }
        Iterator<Entry<Integer,Integer>> iterator = counter.entrySet().iterator();
        if(counter.size()==3){
            if(iterator.hasNext()){
                Entry<Integer,Integer> firstEntry = iterator.next();
                boolean allValuesEqual = true;
                int firstValue = firstEntry.getValue();
                while(iterator.hasNext()){
                    Entry<Integer,Integer> entry = iterator.next();
                    int nextValue = entry.getValue();
                    if(nextValue!=firstValue){
                        allValuesEqual = false;
                        maximumPossible = Math.min(firstValue,nextValue);
                        break;
                    }
                }if(allValuesEqual){
                    maximumPossible = firstValue;
                }
            }
        }return maximumPossible;
    }  

    public void divideIntoGroups(int[] array,int range){
        String maths="";
        String programmer = "";
        String physical = "";
        for(int i=0; i<array.length; i++){
            if(array[i]==1){
                programmer+= i+1+"";
            }else if(array[i]==2){
                maths+= i+1+"";
            }else{
                physical+= i+1+"";
            }
        }
        for(int j=0; j<range; j++){
            System.out.println(programmer.charAt(j)+" "+maths.charAt(j)+" "+physical.charAt(j));
        }
    }
    // public void arrayPrinter(int[] array){
    //     StringBuilder string = new StringBuilder();
    //     string.append("[");
    //     for(int i = 0; i<array.length; i++){
    //         string.append(array[i]);
    //         if(i<array.length-1){
    //             string.append(", ");
    //         }
    //     }
    //     string.append("]");
    //     System.out.println(string);
    // }
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        int range = inputs.nextInt();
        int[] numbers = new int[range];
        for(int i=0; i<range; i++){
            numbers[i] = inputs.nextInt();
        }
        GiftedTriplets obj = new GiftedTriplets();
        int groups = obj.getCount(numbers);
        System.out.println(groups);
        if(groups!=0){
            obj.divideIntoGroups(numbers,groups); 
        }
    }
}

// 7
// 1 3 1 3 2 1 2

// 4
// 2 1 1 2

