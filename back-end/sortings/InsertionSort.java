package sortings;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {

    List<Integer> elements;

    public InsertionSort() {
        this.elements = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        for (int i=0; i<range; i++){
            System.out.print("Enter element "+i+" : ");
            this.elements.add(scanner.nextInt());
        }
        // this.elements.add(10);
        // this.elements.add(9);
        // this.elements.add(8);
        // this.elements.add(7);
        // this.elements.add(6);
        // this.elements.add(5);
        // this.elements.add(4);
        // this.elements.add(3);
        // this.elements.add(2);
        // this.elements.add(1);
    }
    public long time(){
        return System.nanoTime();
    }
public static void main(String args[]) {
        InsertionSort is = new InsertionSort();
        long start = is.time();
        int iters = is.insertionSort();
        long end = is.time();
        is.display();
        System.out.println(end-start + " nanoseconds");
        System.out.println(iters);
    }

    public int insertionSort() {
        int count=0;
        for(int i=1; i<this.elements.size(); i++){
            // count+=1;
            int key = this.elements.get(i);
            int j= i-1;
            while (j>=0 && key < this.elements.get(j)) {
                this.elements.set(j+1, elements.get(j));
                j = j-1;
                count++;
            }
            this.elements.set(j+1, key);
        }
        return count;
    }

    public void display() {
        for(int i=0; i<this.elements.size(); i++) {
            System.out.println(this.elements.get(i));
        }
    }
}