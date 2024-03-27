package sortings;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    List<Integer> elements;
    public BubbleSort(){
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
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
            long start = bs.time();
            int iters = bs.bubbleSort();
            long end = bs.time();
            bs.display();
            System.out.println(end-start+" nanoseconds");
            System.out.println(iters);
    }

    public int bubbleSort() {
        int count=0;
        for(int i=0;i<this.elements.size(); i++) {
            for(int j=0;j<this.elements.size()-i-1; j++){
                count+=1;
                if(elements.get(j) > elements.get(j+1)){
                    int temp = elements.get(j);
                    elements.set(j, elements.get(j+1));
                    elements.set(j+1, temp);
                }
            }
        }
        return count;
    }

    public void display() {
        for(int i=0;i<this.elements.size(); i++) {
            System.out.println(this.elements.get(i));
        }
    }
}