import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class UnderstandingFailFastandFailSafe {
    public void failFast(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        Iterator<Integer> it = numbers.iterator();
        System.out.println("fail fast");
        while(it.hasNext()){
            System.out.println(it.next());
            numbers.add(10);
        }
    }
    public void failSafe(){
        CopyOnWriteArrayList<Integer> array = new CopyOnWriteArrayList<>(new Integer[]{1,2,3,4,5});
        Iterator<Integer> itr = array.iterator();
        System.out.println("fail safe");
        System.out.println("in the loop");
        while(itr.hasNext()){
            System.out.println(itr.next());
            array.add(10);
        }System.out.println("after the loop and modification: "+array);
    }
    public static void main(String[] args) {
        UnderstandingFailFastandFailSafe object = new UnderstandingFailFastandFailSafe();
        // object.failFast();
        object.failSafe();
    }
}
