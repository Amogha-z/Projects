import java.util.ArrayList;

public class EvenOddArrangement {
    
    public void arrange(int[] array) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int num : array) {
            if (num >= 0) {
                insertAt(newArray, positiveIndex, num);
                positiveIndex += 2;
            } else {
                insertAt(newArray, negativeIndex, num);
                negativeIndex += 2;
            }
        }

        System.out.println(newArray);
    }

    private void insertAt(ArrayList<Integer> list, int index, int value) {
        if (index < list.size()) {
            list.add(index, value);
        } else {
            list.add(value);
        }
    }

    public static void main(String[] args) {
        EvenOddArrangement object = new EvenOddArrangement();
        int[] array = {2, -5, -4, 6, 1, -2,-7,9};
        object.arrange(array);
    }
}
