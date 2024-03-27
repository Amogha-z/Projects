import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    
    public int getInput(){
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        return line;
    }
    public int biCoeff(int x,int y){
        int res = 1;
        if(y> x-y){
            y = x-y;
        }
        for(int i=0; i<y; ++i){
            res *= (x-i);
            res /= (i+1);
        }
        return res;
    }
    public ArrayList<ArrayList<Integer>> process(int range){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<range; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                temp.add(biCoeff(i,j));
            }
            result.add(temp);
        }return result;
    }
    public static void main(String[] args) {
        PascalTriangle object = new PascalTriangle();
        int range = object.getInput();
        System.out.println(object.process(range));
    }
}
