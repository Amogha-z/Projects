package sortings;

import java.util.ArrayList;
import java.util.List;

class QuickSort{
    List<Integer> elements;

    public QuickSort(){
        this.elements = new ArrayList<Integer>();
        this.elements.add(10);
        this.elements.add(9);
        this.elements.add(8);
        this.elements.add(7);
        this.elements.add(6);
        this.elements.add(5);
        this.elements.add(4);
        this.elements.add(3);
        this.elements.add(2);
        this.elements.add(1);
    }
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        qs.quickSortWrapper(qs.elements, 0, qs.elements.size()-1);
        qs.display();
    }

    public int quickSort(List<Integer> elems, int start, int end){
        int pivotElemnt = elems.get(end);
        int pivotPosition = start;

        for(int j=start; j<end; j++){
            if(elems.get(j) <= pivotElemnt) {
                int temp = elems.get(j);
                elems.set(j, elems.get(pivotPosition));
                elems.set(pivotPosition, temp);
                pivotPosition = pivotPosition + 1;
            }
        }
        int temp1 = elems.get(pivotPosition);    
        elems.set(pivotPosition, elems.get(end));
        elems.set(end, temp1);
        return pivotPosition;
    }

    public void quickSortWrapper(List<Integer> elems, int start, int end) {
        if (start < end){
            int pivotPosition = quickSort(elems, start, end);
            quickSortWrapper(elems, start, pivotPosition-1);
            quickSortWrapper(elems, pivotPosition+1, end);
        }   
    }

    public void display() {
        for(int i=0; i<elements.size(); i++){
            System.out.println(elements.get(i));
        }
    }
}