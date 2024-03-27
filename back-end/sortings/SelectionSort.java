package sortings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {    
    
    private List<Integer> elements;
    public SelectionSort(){
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
    public int selectionSort() {
        int count=0;
        for(int i=0;i<this.elements.size(); i++) {
            for(int j=i+1; j<this.elements.size(); j++) {
                count+=1;
                if(this.elements.get(i) > this.elements.get(j)) {
                    int temp = this.elements.get(i);
                    this.elements.set(i, this.elements.get(j));
                    this.elements.set(j, temp);
                }
            }
        }
        return count;
    }

    public void display() {
        for(int i=0;i<this.elements.size(); i++){
            System.out.println(this.elements.get(i));
        }
    }
    public static void main(String[] args) {
            SelectionSort ss = new SelectionSort();
            long start = ss.time();
            int iters = ss.selectionSort();
            long end = ss.time();
            ss.display();
            System.out.println(end-start+" nanoseconds");
            System.out.println(iters);
    }
}